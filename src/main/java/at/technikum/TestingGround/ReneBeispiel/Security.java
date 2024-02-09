package at.technikum.TestingGround.ReneBeispiel;

import java.util.ArrayList;
import java.util.List;

public class Security {

    private List<SecurityCode> securityCodes;

    public Security() {
        securityCodes = new ArrayList<>();
    }

    public void evaluateCode(String code) {
        securityCodes.add(new HighSecurityCode());
        securityCodes.add(new LowSecurityCode());

        if (code.isBlank() || code.isEmpty()){
            System.out.println("no code entered");
            return;
        }

        for (SecurityCode securityCode : securityCodes){
            if (securityCode.findOutIfCodeIsValid(code)){
                System.out.println("Code " + code + " is valid: " + securityCode.getName());
                return;
            }
        }

        System.out.println("Code " + code + "is invalid");

    }
}
