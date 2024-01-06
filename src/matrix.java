import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class matrix {

    public Boolean is_square(long val){

        double sq = Math.sqrt(val);
        long sqq = (long)sq;
        return sqq*sqq == val;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        matrix obj = new matrix();

        int test_cases = input.nextInt();

        for (int tt = 0; tt < test_cases; ++tt) {

            long n = input.nextLong();

            ArrayList<Long> ar = new ArrayList<>();

            long sum = 0L;

            for (int i = 0; i < n; ++i) {

                ar.add(input.nextLong());
                sum += ar.get(i);
            }
            if (obj.is_square(sum)) System.out.println("Yes");
            else System.out.println("No");

        }

    }
}
