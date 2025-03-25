public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);
        return slope1 == slope2;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;

        if (isCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the Slope method.");
        } else {
            System.out.println("The points are NOT collinear using the Slope method.");
        }

        if (isCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the Area method.");
        } else {
            System.out.println("The points are NOT collinear using the Area method.");
        }
    }
}



