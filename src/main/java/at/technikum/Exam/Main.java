package at.technikum.Exam;

public class Main {// REDACTED: package

// REDACTED: imports

    public static void main(String[] args) {
        // Java Introduction Course
        Course javaIntroduction = new Course("Java Introduction");
        javaIntroduction.addElement(new Chapter("Variables", "Java: A Beginner’s Guide"));
        javaIntroduction.addElement(new Chapter("Functions", "Java: A Beginner’s Guide"));
        javaIntroduction.addElement(new Chapter("Classes", "Java: A Beginner’s Guide"));
        javaIntroduction.addElement(new Chapter("Interfaces", "Java: A Beginner’s Guide"));
        javaIntroduction.addElement(new Test("Multiple Choice", 50));

        javaIntroduction.print();

        // Backend Development Course
        Course backendDevelopment = new Course("Backend Development");
        backendDevelopment.addElement(new Chapter("Client-Server", "RESTful Web Services"));
        backendDevelopment.addElement(new Chapter("Layered Architecture", "RESTful Web Services"));
        backendDevelopment.addElement(new Chapter("Data Handling", "RESTful Web Services"));
        backendDevelopment.addElement(new Chapter("ORM", "RESTful Web Services"));
        backendDevelopment.addElement(new Test("Multiple Choice 1/2", 25));
        backendDevelopment.addElement(new Chapter("Testing", "RESTful Web Services"));
        backendDevelopment.addElement(new Chapter("Security", "RESTful Web Services"));
        backendDevelopment.addElement(new Test("Multiple Choice 2/2", 25));

        backendDevelopment.print();

        // Learn Coding with Perl
        Course perl = new Course("Learn Coding with Perl");
        perl.addElement(new Chapter("Keywords and Syntax", "Programming Perl"));
        perl.addElement(new Chapter("Best practices", "Programming Perl"));
        perl.addElement(new Test("Perl Diving", -5));

        perl.print();

        // course not in use anymore
        perl.clear();

        perl.print();

        // Export to Moodle
        Exporter exporter = new MoodleExporter();

        try {
            exporter.export(javaIntroduction);
            exporter.export(backendDevelopment);
            exporter.export(perl);
        } catch (IllegalArgumentException e) {
            System.err.printf("Course could not be exported: " + e.getMessage());
        }
    }
}
