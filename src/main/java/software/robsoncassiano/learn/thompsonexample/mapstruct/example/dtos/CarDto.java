package software.robsoncassiano.learn.thompsonexample.mapstruct.example.dtos;

import lombok.Value;

@Value
public class CarDto {
    String make;
    String type;
    Integer seatCount;
}
