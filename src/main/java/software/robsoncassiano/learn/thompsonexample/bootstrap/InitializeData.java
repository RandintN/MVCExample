package software.robsoncassiano.learn.thompsonexample.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import software.robsoncassiano.learn.thompsonexample.entities.Author;
import software.robsoncassiano.learn.thompsonexample.entities.Book;
import software.robsoncassiano.learn.thompsonexample.entities.Publisher;
import software.robsoncassiano.learn.thompsonexample.repositories.AuthorRepository;
import software.robsoncassiano.learn.thompsonexample.repositories.BookRepository;
import software.robsoncassiano.learn.thompsonexample.repositories.PublisherRepository;

@Component
public class InitializeData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public InitializeData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        final Author eric = new Author("Eric", "Evans");
        final Author rod = new Author("Rod", "Johnson");
        final Publisher publisher = new Publisher("O'relly", "Avenue Street");

        final Book ddd = new Book("Domain Driven Design", "sdf15d8452");
        final Book noEJB = new Book("Development without EJB", "sdf15dasf8452");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        publisher.getBooks().add(ddd);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        publisher.getBooks().add(noEJB);
        publisher.getBooks().add(ddd);

        bookRepository.save(ddd);
        bookRepository.save(noEJB);
        authorRepository.save(eric);
        authorRepository.save(rod);
        publisherRepository.save(publisher);


        System.out.println("Started Data Initialization");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of publishers: " + publisherRepository.count());
        System.out.println("Publishers number of books: " + publisher.getBooks().size());
    }
}
