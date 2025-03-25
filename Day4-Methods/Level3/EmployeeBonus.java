
import java.util.Random;

public class EmployeeBonus {
    public static final int EMPLOYEES = 10;

    // Method to generate random salary and years of service
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] employeeData = new int[EMPLOYEES][2];

        for (int i = 0; i < EMPLOYEES; i++) {
            employeeData[i][0] = 30000 + random.nextInt(20001); // Salary between 30,000 and 50,000
            employeeData[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        return employeeData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] newSalaryData = new double[EMPLOYEES][3];

        for (int i = 0; i < EMPLOYEES; i++) {
            double bonusPercent = (employeeData[i][1] > 5) ? 0.05 : 0.02;
            double bonusAmount = employeeData[i][0] * bonusPercent;
            double newSalary = employeeData[i][0] + bonusAmount;

            newSalaryData[i][0] = employeeData[i][0];
            newSalaryData[i][1] = bonusAmount;
            newSalaryData[i][2] = newSalary;
        }
        return newSalaryData;
    }

    // Method to display results
    public static void displayResults(int[][] employeeData, double[][] newSalaryData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("EmpID  Old Salary  Years of Service  Bonus Amount  New Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEES; i++) {
            totalOldSalary += newSalaryData[i][0];
            totalBonus += newSalaryData[i][1];
            totalNewSalary += newSalaryData[i][2];

            System.out.printf("%4d %10.2f %16d %14.2f %11.2f\n",
                    (i + 1), newSalaryData[i][0], employeeData[i][1],
                    newSalaryData[i][1], newSalaryData[i][2]);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total   %10.2f %18s %14.2f %11.2f\n",
                totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] newSalaryData = calculateBonus(employeeData);
        displayResults(employeeData, newSalaryData);
    }
}

