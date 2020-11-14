import java.util.Scanner;

public class SafePassword {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your password: ");
        String password = input.nextLine();

        if (SafePassword.isValidPassword(password)) {
            System.out.println(" The password you have chosen is valid.");
        } else {
            System.out.println("Your password must be at least 8 characters, and contain at least 1 uppercase letter, 1 lowercase letter, 1 number and 1 character.");
        }
    }


    public static boolean isValidPassword(String password) {

        int stringLength = password.length();
        boolean isValid = false;
        boolean isNumeric= false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean isChar = false;


        for(int i = 0; i < stringLength; i++){
            char character = password.charAt(i); //returns the char at place i in a string

            if('a' <= character && character <= 'z'){  //checks if char is a lowercase letter
                lowerCase = true;
            }else if('A' <= character && character <= 'Z') { //checks if char is uppercase
                upperCase = true;
            }else if('0' <= character && character <= '9'){ //checks if it is a number
                isNumeric = true;
            }else{
                isChar= true; //if not a letter or number
            }
        }

        if(isNumeric && lowerCase && upperCase && isChar && stringLength >=8)
            isValid = true;

        return isValid;
    }
}

