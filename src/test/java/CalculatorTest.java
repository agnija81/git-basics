import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator casio = new Calculator("Casio", "G-shock");

    @Test
    public void testSum() {
        Assert.assertEquals(casio.sum(10,5), 15);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(casio.divide(10,5), 2);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(casio.subtract(12,5), 7);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(casio.multiply(8,6), 48);
    }

    @Test
    public void testPow() {
        Assert.assertEquals(casio.pow(8), 64);
    }

    @Test
    public void testSetName() {
        casio.setName("NewCasio");
        Assert.assertEquals(casio.getName(), "NewCasio");
    }

    @Test
    public void testSetModelName() {
        casio.setModelName("XXXX");
        Assert.assertEquals(casio.getModelName(), "XXXX");
    }

    @Test
    public void testToString() {

        String toString = "Calculator{" +
                "name='" + casio.getName() + '\'' +
                ", modelName='" + casio.getModelName() + '\'' +
                '}';

        Assert.assertEquals(toString, casio.toString());
    }
}
