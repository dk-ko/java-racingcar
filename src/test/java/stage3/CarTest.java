package stage3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CarTest {
    private CarApplication ca;
    private Car car;

    @BeforeAll
    void setup() {
        ca = new CarApplication();
        car = new Car();
    }

    @Test
    @DisplayName("전진 조건 테스트")
    void forwardConditionTest() {
        int minValue = 0;
        int maxValue = 9;
        int result = car.getForwardCondition();
        assertTrue(result >= minValue && result <= maxValue);
    }

//    @Test
//    @DisplayName("전진 조건 얻기")
//    void tryTest() {
//        car.tryForward();
//    }
}
