package academic.driver;

import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24001 Fredrick Laurensius Aritonang
 */
public class Driver3 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break; // Stop reading input
            }

            // Parse the input line
            String[] parts = line.split("#");
            // Input format: courseCode#studentId#academicYear#semester (4 parts)
            if (parts.length == 4) {
                String courseCode = parts[0];
                String studentId = parts[1];
                String academicYear = parts[2];
                String semester = parts[3];

                Enrollment enrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                enrollments.add(enrollment);
            } else {
                // Optionally handle malformed input lines
                System.err.println("Input format error: " + line);
            }
        }

        input.close(); // Close the scanner to prevent resource leak

        // Display all stored enrollments
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}