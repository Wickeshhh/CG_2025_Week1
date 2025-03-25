
import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    public static int generateOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // 6-digit number
    }

    public static boolean validateUniqueOTPs(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.print("Generated OTPs: ");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }

        System.out.println("\nAre all OTPs unique? " + validateUniqueOTPs(otps));
    }
}

