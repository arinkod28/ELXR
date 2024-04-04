import java.util.Arrays;

public class passanduser {


    public static boolean isPasswordCorrect(char[] password) {

        boolean isCorrect = true;
        char[] correctPassword = {'1', '2', '3', '4', '5', '6'};

        if (password.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(password, correctPassword);
        }

        //Zero out the password.
        // Arrays.fill(correctPassword, '*');

        return isCorrect;
    }
    public static boolean isUsernameCorrect (char[] username) {

        boolean isCorrect = true;
        char[] correctUsername = {'a', 'r', 'i', 'n', '1', '2', '3'};

        if (username.length != correctUsername.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(username, correctUsername);
        }



        return isCorrect;
    }
}
