package at.technikum.TestingGround.ReneBeispiel;

import java.util.List;

public abstract class SecurityCode {

    private String name;
    private List<Validator> validators;

    public SecurityCode(String name, List<Validator> validators) {
        this.name = name;
        this.validators = validators;
    }

    public final boolean findOutIfCodeIsValid(String code){
        for (Validator validator : validators){
            if (!validator.validate(code)){
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }
}
