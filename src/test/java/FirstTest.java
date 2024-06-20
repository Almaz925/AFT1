import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class FirstTest {

//Кратно 3, возвращать "Т"
//Кратно 5, возвращать "M"
//Кратно 3 и 5 , возвращать "EMC"
//Возвращать "Fail"

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "EMC";
        } else if (number % 3 == 0) {
            return "T";
        } else if (number % 5 == 0) {
            return "M";
        } else return "Fail";
    }

    @Test
    public void tmcTest() {
        String actualResult = trialCode(9);
        assertEquals(actualResult, "T");
    }

    @Test
    public void tmcTest1() {
        String actualResult = trialCode(10);
        assertEquals(actualResult, "M");
    }

    @Test
    public void tmcTest2() {
        String actualResult = trialCode(15);
        assertEquals(actualResult, "EMC");
    }

    @Test
    public void tmcTest3() {
        String actualResult = trialCode(17);
        assertEquals(actualResult, "Fail", "The returned value does not correspond");
    }
}
