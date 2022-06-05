package software.robsoncassiano.learn.thompsonexample.mapstruct.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Car {
    private String make;
    private Integer numberOfSeats;
    private CarType type;
}
