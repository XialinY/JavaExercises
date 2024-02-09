package at.technikum.TestingGround.ReneBeispiel;

import java.util.List;

public class LengthValidator implements Validator{

    private List<Integer> options;

    public LengthValidator(List<Integer> options) {
        this.options = options;
    }

    @Override
    public boolean validate(String code) {
        //loop through the options list
        for (Integer codeLength : options){
            if (code.length() == codeLength){
                return true;
            }
        }
        return false;
    }
}
