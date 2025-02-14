package data_streams;

import java.io.*;

public class StoreAndRetrievePrimitiveData {
    private static final String FILE_NAME = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-03\\src\\main\\java\\data_streams\\StudentData.dat";

    public static void writeStudentData(int rollNumber, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeStudentData(101, "Muskan", 9.5);
        writeStudentData(102, "Nancy", 9.1);

        System.out.println("Reading data:");
        readStudentData();
    }
}