import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest {
    Calculator c = new Calculator(3,4);

    @Test
    public void testAdd(){
        Assert.assertEquals(7,c.add());

    }

    @Test
    public void testSub(){
        Assert.assertEquals(-1,c.sub());

    }

    @Test
    public void testMult(){
        Assert.assertEquals(12,c.mul());

    }

}
