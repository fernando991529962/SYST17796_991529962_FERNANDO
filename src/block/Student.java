package block;

import java.util.Scanner;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override 
    public String toString() {
        return id + " - " + name;
    }
    
    
    public static void main(String[] args) {
//        Student s1 = new Student(128543, "Bobby Brown");
//        Student s2 = new Student(128544, "Jason Green");
//        Student s3 = new Student(128545, "Billy White");
//        Student s4 = new Student(128546, "Tommy Lee");
//        Student s5 = new Student(128547, "Richard Manson");
//        Student[] studentList = {s1, s2, s3, s4, s5};
        printStudents(createStudentList());
    }
    
    public static void printStudents(Student[] studentList) {
        
        System.out.println("Printing student list...");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
    }
    
    public static Student[] createStudentList() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the amount of students to add: ");
        int numStudents = input.nextInt();
        Student[] studentList = new Student[numStudents];
        
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = input.next();
            
            System.out.print("Enter the ID # of student " + (i + 1) + ": ");
            int id = input.nextInt();
            
            studentList[i] = new Student(id, name);
           
        }
    
        return studentList;
    }
    
}
