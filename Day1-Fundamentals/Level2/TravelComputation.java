import java.util.Scanner;
public class TravelComputation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Name:");
String name = scanner.nextLine();
System.out.println("Enter starting city");
//Input the cities from start to destination
String fromCity = scanner.nextLine();
String viaCity = scanner.nextLine();
String toCity = scanner.nextLine();
//Input the distances, time and total distance

double distanceFromToVia = scanner.nextDouble();
int timeFromToVia = scanner.nextInt();
double distanceViaToFinalCity = scanner.nextDouble();
int timeViaToFinalCity = scanner.nextInt();
double totalDistance = (double)distanceFromToVia +

(double)distanceViaToFinalCity;
//Calculate the total time

int totalTime = (int)timeFromToVia + (int)timeViaToFinalCity;

//Displaying the output

System.out.println("The Total Distance travelled by " + name +" from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + "minutes");
}
}