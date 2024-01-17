package at.technikum.Exercises.Covid;

public abstract class CoronaTest {
    private boolean isPositive;
    private Date testDate;

    public CoronaTest(Date testDate, boolean isPositive){
        this.testDate = testDate;
        this.isPositive = isPositive;
    }

    public CoronaTest(CoronaTest test) {
        this.testDate = test.getTestDate();
        this.isPositive = test.isPositive();
    }

    public Date getTestDate(){
        return this.testDate;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public abstract Date validUntil();

    public String outcome(){
        if (isPositive){
            return "positive, quarantine until: " + validUntil();
        }
        return "negative, valid until: " + validUntil(); //TODO insert date
    }
}
