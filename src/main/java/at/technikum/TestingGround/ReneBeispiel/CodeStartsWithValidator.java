package at.technikum.TestingGround.ReneBeispiel;


import java.util.List;

public class CodeStartsWithValidator implements Validator{
    private List<String> options;

    public CodeStartsWithValidator(List<String> options) {
        this.options = options;
    }

    @Override
    public boolean validate(String code) {

        //loop through the options list
        for (String codeStart : options) {
            if (code.startsWith(codeStart)) {
                return true;
            }
        }
        return false;
    }
}
