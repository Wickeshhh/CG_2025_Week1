
import java.util.Random;

public class VotingEligibility {
    public static void checkVotingEligibility(int[] ages) {
        System.out.println("Age\tCan Vote?");
        for (int age : ages) {
            System.out.println(age + "\t" + (age >= 18));
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] ages = random.ints(10, 10, 25).toArray();
        checkVotingEligibility(ages);
    }
}

