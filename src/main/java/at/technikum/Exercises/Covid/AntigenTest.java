package at.technikum.Exercises.Covid;

public class AntigenTest extends CoronaTest{
    public AntigenTest(Date testDate, boolean isPositive) {
        super(testDate, isPositive);
    }


    public Date validUntil() {
        Date validTill = new Date(getTestDate());
        if (isPositive()){
            validTill.addDay(14);
            return validTill;
        }

        validTill.addDay(2);
        return validTill;
    }
}
