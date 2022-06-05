package software.robsoncassiano.learn.thompsonexample.mapstruct.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import software.robsoncassiano.learn.thompsonexample.mapstruct.example.dtos.CarDto;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {
    @Test
    void shouldMapCarToDto() {
        // Given
        final Car car = new Car("Morris", 5, CarType.SEDAN);

        // When
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        // Then
        assertThat(carDto).isNotNull();
        assertThat(carDto.getMake()).isEqualTo("Morris");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getType()).isEqualTo("SEDAN");
    }
}