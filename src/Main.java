
public class Main {
    public static void main(String[] args) {
        String[] accountValid = new String[] {"123abc_","_abc123","______", "123456","abcdefg"};
        String[] accountInValid = new String[] {".@","12345","1234_", "123456","abcde"};
      ValidateAccount validateAccount = new ValidateAccount();
    for (String account : accountValid) {
        boolean isValid = validateAccount.validate(account);
        System.out.println("Accounts " + account + "have validate is: " + isValid);
    }
        for (String account : accountInValid) {
            boolean isValid = validateAccount.validate(account);
            System.out.println("Accounts " + account + " have validate is: " + isValid);
        }

    }
}