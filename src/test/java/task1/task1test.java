package task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import task1.Cos;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class task1test {


    @ParameterizedTest(name = "cos({0})")
    @DisplayName("Check Default Table dots")
    @ValueSource(doubles = {-2*Math.PI, -Math.PI, -Math.PI*0.5, 0, 0.5*Math.PI, Math.PI, 2*Math.PI})
    void checkDefaultValues(double param)
    {
        assertAll(
                () -> assertEquals(Math.cos(param), Cos.cosx(param, 100), 0.0001));
    }


    @ParameterizedTest(name = "cos({0}) = {1}")
    @DisplayName("Check random dots")
    @CsvFileSource(resources = "/table_values.csv", numLinesToSkip = 1, delimiter = ';')
    void checkTableValues(double x, double y)
    {
        assertAll(
                () -> assertEquals(y, Cos.cosx(x, 100), 0.0001)
        );
    }
}
