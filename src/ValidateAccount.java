import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    String REGEX = "^[_a-z0-9]{6,}";
    Pattern pattern;
    Matcher matcher;
    public ValidateAccount() {
    }
    public boolean validate(String email) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}