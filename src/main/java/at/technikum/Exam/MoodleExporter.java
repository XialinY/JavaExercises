package at.technikum.Exam;

import java.util.Scanner;

public class MoodleExporter implements Exporter{


    @Override
    public void export(Course course) throws IllegalArgumentException {

        Scanner input = new Scanner(System.in);
        String ip = "technikum-wien.at";

        if (course.getElementList().size() != 0) {
            System.out.print("Enter Moodle server IP: ");
            String newInput = input.next();

            if (newInput.equals(ip)) {
                System.out.println("Successfully uploaded course [" + course.getName() + "] to:" + ip);
            } else System.out.println("Server timeout: " + newInput);


        } else throw new IllegalArgumentException("Course is empty!");

    }
}
