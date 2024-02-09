package at.technikum.TestingGround.ReneBeispiel;

public class Main {

    public static void main(String[] args) {
        Security  sec = new Security();

        sec.evaluateCode("123456789012345");
        sec.evaluateCode("12345");
        sec.evaluateCode("58765");
        sec.evaluateCode("1434567890");
        sec.evaluateCode(" ");
    }
}
