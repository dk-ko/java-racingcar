package stage4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {

    private String carName = "name";

    private CarService createCarService(String carName, int currentStatus) {
        return new CarService(new Car(carName, currentStatus));
    }

    @Test
    @DisplayName("tryForward - 멈춤 테스트")
    void tryStopTest() {
        // given
        final int currentStatus = 0;
        final int impossible = 3;
        final int expectedStatus = 0;
        CarService carService = this.createCarService(carName, currentStatus);

        // when
        final int result = carService.tryForward(impossible);

        // then
        assertThat(expectedStatus).isEqualTo(result);
    }

    @Test
    @DisplayName("tryForward - 전진 테스트")
    void tryForwardTest() {
        // given
        final int currentStatus = 0;
        final int possible = 4;
        final int expectedStatus = 1;
        CarService carService = this.createCarService(carName, currentStatus);

        // when
        final int result = carService.tryForward(possible);

        // then
        assertThat(expectedStatus).isEqualTo(result);
    }
}
