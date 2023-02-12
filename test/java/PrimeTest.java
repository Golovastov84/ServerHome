import MyCod.StudySkillbox.Modul_14_6.ToPrimeTest;
import junit.framework.TestCase;

public class PrimeTest extends TestCase {
    int a, b;
    @Override
    protected void setUp() throws Exception{
        a = 1;
        b = 2;
    }

    public void testCalculate(){
        int actual = ToPrimeTest.calculate(a, b);
        int extexted = a - 2 * b;
        TestCase.assertEquals(extexted, actual);
    }

    @Override
    protected void tearDown() throws Exception{
        a = 0;
        b = 0;
    }
}
