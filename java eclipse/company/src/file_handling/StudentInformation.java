package file_handling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
     String name;
     int age;
     String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

public class StudentInformation {
    private static final String path = "info.txt";

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        try {
            File file = new File(path);
            if (file.exists()) {
                // Read existing student information from file
                readStudentInfoFromFile(file, studentList);
            } else {
                // Create a new file if it doesn't exist
                file.createNewFile();
            }

            Scanner scanner = new Scanner(System.in);
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("----- Student Information System -----");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                String name;
                int age;
                String grade;
                switch (choice) {
                    case 1:
                        // Add Student
                        System.out.print("Enter student name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        age = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter student grade: ");
                        grade = scanner.nextLine();
                        Student student = new Student(name, age, grade);
                        studentList.add(student);
                        writeStudentInfoToFile(file, studentList);
                        System.out.println("Student added successfully!");
                        break;
                    case 2:
                        // Display All Students
                        if (studentList.isEmpty()) {
                            System.out.println("No students found.");
                        } else {
                            System.out.println("----- Student List -----");
                            for (Student s : studentList) {
                                System.out.println(s);
                            }
                        }
                        break;
                    case 3:     // Exit                
                        isRunning = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void readStudentInfoFromFile(File file, List<Student> studentList) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String name = data[0].trim();
                    int age = Integer.parseInt(data[1].trim());
                    String grade = data[2].trim();
                    Student student = new Student(name, age, grade);
                    studentList.add(student);
                }
            }
        }
    }

    private static void writeStudentInfoToFile(File file, List<Student> studentList) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Student student : studentList) {
                writer.write(student.name + ", " + student.age + ", " + student.grade);
                writer.newLine();
            }
        }
    }
}
