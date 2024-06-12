import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;

public class TestCalculatorCSV {
    @ParameterizedTest
    @CsvFileSource(resources = "/add.csv", numLinesToSkip = 1)
    void test1(int a, int b, int result) {
        Calculator math = new Calculator();
        Assertions.assertEquals(result, math.add(a,b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/substract.csv", numLinesToSkip = 1)
    void test2(int a, int b, int result) {
        Calculator math = new Calculator();
        Assertions.assertEquals(result, math.substract(a,b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiply.csv", numLinesToSkip = 1)
    void test3(int a, int b, int result) {
        Calculator math = new Calculator();
        Assertions.assertEquals(result, math.multiply(a,b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/divide.csv", numLinesToSkip = 1)
    void test4(float a, float b, float result) {
        Calculator math = new Calculator();
        float actual = math.divide(a, b);
        float delta = 0.0001f; // Specify a suitable delta for floating-point comparison
        Assertions.assertEquals(result, actual, delta);
    }
}
