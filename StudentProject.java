package Collecections;
import java.util.*;
public class StudentProject {
	static ArrayList<student>a1;
	static Scanner s;
	public static void main(String[] args) {
		a1=new ArrayList<student>();
		s=new Scanner(System.in);
		int ch=0;
		do {
		System.out.println("1.Add a new student :");
		System.out.println("2.Delete any student :");
		System.out.println("3.Update any student");
		System.out.println("4.Show all student :");
		System.out.println("10.Exit..");
		System.out.println("Enter your Choice :");
		ch=s.nextInt();
			switch(ch) {
			case 1:addStudent();
				break;
			case 2:deleteStudent();
				break;
			case 3:updateStudent();
				break;
			case 4:showStudent();
				break;
			case 10:System.out.println("Exiting...");
				break;
            default:
                System.out.println("Invalid choice! Please try again.");
			}
		}
			while(ch!=0);
			
	}
	public static void showStudent() {
		 if (a1.isEmpty()) {
	            System.out.println("No students to display.");
	        } else {
	            System.out.println("student List:");
	            for (student s : a1) {
	                System.out.println(s);
	            }
	        }
	}
	private static void updateStudent() {
		System.out.print("Enter the Roll Number to update: ");
        int r = s.nextInt();
        s.nextLine(); // Consume the newline
        boolean found = false;
        for (student s1 : a1) {
            if (s1.roll == r) {
                System.out.print("Enter the new Name: ");
                String n = s.nextLine();
                System.out.print("Enter the new Marks: ");
                int m = s.nextInt();
                s1.name = n;
                s1.marks = m;
                found = true;
                System.out.println("student details updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("student with Roll Number " + r + " not found.");
        }
		
	}
	private static void deleteStudent() {
		System.out.println("Enter the roll Number ti delete ");
		int r =s.nextInt();
		Iterator<student>i1=a1.iterator();
		while(i1.hasNext()) {
			student s1=i1.next();
			if(s1.roll==r) {
				i1.remove();
			}
		}
		System.out.println("the student is deleted.");
	}
	public static void addStudent() {
		System.out.println("Enter the student Roll Number :");
		int r=s.nextInt();
		s.nextLine();
		System.out.println("Enter the student Name :");
		String n=s.nextLine();
		System.out.println("Enter the marks of student :");
		int m=s.nextInt();
		a1.add(new student(r,n,m));
		 System.out.println("student added successfully.");
	}
}
