package at.technikum.TestingGround.ReneBeispiel;

import java.util.List;

public class HighSecurityCode extends SecurityCode{

    public HighSecurityCode(){
        super("High Security Code", List.of(new LengthValidator(List.of(15)), new CodeStartsWithValidator(List.of("12","14"))));

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
