public class Student{


    private String studentName;
    private int rollNumber;
    private double marks;


    Student (String studentName, int rollNumber, double marks){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    public String grades(){
        if (marks > 90){
            return "A+";
        } else if (marks > 80){
            return "A";
        } else if (marks > 70){
            return "B";
        } else if (marks > 60){
            return "C";
        } else if (marks > 50){
            return "D";
        } else {
            return "F";
        }
    }  


    public void display(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grades());
    }
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);


        Student student1 = new Student("Akhilesh", 01, 75);
        Student student2 = new Student("Rick", 02, 91);
        student1.display();
        student2.display();
        // scanner.close();
    }
}
