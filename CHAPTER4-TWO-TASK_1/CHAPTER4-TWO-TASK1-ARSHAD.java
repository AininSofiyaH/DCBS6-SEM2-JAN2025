import java.util.Scanner;//insert util scanner function to read user input

public class password {//name file of the writer of this code "arshad" 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//change the scanner name to read instead of scanner or scan
        String correctPassword = "gmicryptolab"; // the correct password for the user too input is gmicrptolab
        int attempts = 3; // number of attempts allowed is 3
        for (int i = 0; i < attempts; i++) {//predefine the loop where i equal to 3 ,if i less than attempt then i is increment
            System.out.print("Enter your password: ");//get the user input 
            String userInput = read.nextLine();//store the input in userInput variable

            if (userInput.Equal(correctPassword)) {//if user input is equal to correct password then print out correct passowrd
                System.out.println("Password is correct");
                read.close();
                return; // exit the program if the password is correct
            } else {
                System.out.println("Incorrect password. Attempts remaining: " + (attempts - i - 1));//if the user enter the wrong password then print out the remaining attempt and minus the current attempt by 1
            }
        }
        System.out.println("No attempt remaining bye ngahahhahahahhahaha.");//exit the program if the user enter the wrong password 3 times
        read.close();
    }
}
