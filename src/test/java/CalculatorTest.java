import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator target;

    @BeforeEach
    void setUp() {
        target = new Calculator();
    }

    @DisplayName("運賃計算の正常系")
    @ParameterizedTest
    @CsvSource({
            // from, to,    size, weight,  期待値
            "東京都,  北海道,   60,    2,    1370",
            "東京都,  北海道,   80,    5,    1590",
            "東京都,  北海道,  100,   10,    1830",
            "東京都,  北海道,  120,   15,    2050",
            "東京都,  北海道,  140,   20,    2290",
            "東京都,  北海道,  160,   25,    2510",
    })
    void calculate_test01(String from, String to, int size, int weight, int excepted) throws Exception {
        int actual = target.Calculate(from, to, size, weight);
        System.out.println("excepted=" + excepted + ", actual=" + actual);
        assertEquals(excepted, target.Calculate(from, to, size, weight));
    }

}