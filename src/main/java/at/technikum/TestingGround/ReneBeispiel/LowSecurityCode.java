package at.technikum.TestingGround.ReneBeispiel;

import java.util.ArrayList;
import java.util.List;

public class LowSecurityCode extends SecurityCode{

    public LowSecurityCode() {
        super("Low Security Code", List.of(new LengthValidator(List.of(5,10)), new CodeStartsWithValidator(List.of("5","7"))));
    }
}
