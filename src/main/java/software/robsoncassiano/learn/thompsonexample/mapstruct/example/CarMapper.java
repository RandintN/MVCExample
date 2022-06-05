package software.robsoncassiano.learn.thompsonexample.mapstruct.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import software.robsoncassiano.learn.thompsonexample.mapstruct.example.dtos.CarDto;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}
