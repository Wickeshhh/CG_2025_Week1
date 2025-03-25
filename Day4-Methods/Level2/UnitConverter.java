
public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("10 miles to km: " + convertMilesToKm(10));
        System.out.println("1 meter to feet: " + convertMetersToFeet(1));
        System.out.println("3 feet to meters: " + convertFeetToMeters(3));
        System.out.println("5 yards to feet: " + convertYardsToFeet(5));
        System.out.println("10 feet to yards: " + convertFeetToYards(10));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("40 inches to meters: " + convertInchesToMeters(40));
        System.out.println("10 inches to cm: " + convertInchesToCm(10));
    }
}

