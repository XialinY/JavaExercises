package at.technikum.ExamExercise.Covid;

public class PcrTest extends CoronaTest{
    public PcrTest(Date testDate, boolean isPositive) {
        super(testDate, isPositive);
    }


    public Date validUntil(){
        Date validTill = new Date(getTestDate());
        if (isPositive()){
            validTill.addDay(14);
            return validTill;
        }

        validTill.addDay(3);
        return validTill;
    }
}
