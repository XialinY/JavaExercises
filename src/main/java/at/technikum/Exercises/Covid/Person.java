package at.technikum.Exercises.Covid;

import java.util.Arrays;

public class Person {
    private String name;
    private Date birthDate;
    private CoronaTest[] tests;


    public Person(String name, Date birthDate, CoronaTest[] tests) {
        this.name = name;
        setBirthDate(birthDate);
        this.tests = tests;
    }

    public CoronaTest lastTestBeforeDate(Date testsBefore) {
        double difference = Double.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < tests.length; i++){
            if (tests[i].getTestDate().julianDayNumber() < testsBefore.julianDayNumber()) {
                if (testsBefore.compareTo(tests[i].getTestDate()) < difference) {

                    difference = testsBefore.compareTo(tests[i].getTestDate());
                    index = i;
                }
            }
        }
        if (index == -1) {
            return null;
        }
        return tests[index];
    }

    public String coronaStatus(Date date){
        if (lastTestBeforeDate(date) != null) {
            return this.name + ", " + this.birthDate + ", Corona Status" + lastTestBeforeDate(date).outcome();
        }
        return "no valid test available";
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        Date von = new Date(1951, 1, 1);
        Date bis = new Date(2007, 12, 31);
        if (birthDate.julianDayNumber() < von.julianDayNumber() || birthDate.julianDayNumber() > bis.julianDayNumber()){
            throw new IllegalArgumentException("invalid birth date!");
        }
        this.birthDate = birthDate;
    }

    public void setTests(CoronaTest[] tests) {
        this.tests = tests;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public CoronaTest[] getTests() {
        return tests;
    }

    @Override
    public String toString() {
        return name + birthDate + Arrays.toString(tests);
    }
}
