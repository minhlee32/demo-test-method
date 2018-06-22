import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class DemoTestMethod {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        a = scanner.nextInt();
        System.out.println(sumDigits(a));
    }

    @Test
    public void testSumDigits() {
        int a = 666;
        int expected = 18;
        String message = "Passed!";
        int result = DemoTestMethod.sumDigits(a);
        assertEquals(message,expected,result);
    }

    static  int sumDigits(int a) {
        int sum = 0;
        while (a > 10) {
            sum += a % 10;
            a = a / 10;
        }
            sum += a;
            return sum;
        }
    }

