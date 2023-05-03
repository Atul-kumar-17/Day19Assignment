import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//First Name Validation
        System.out.println("Enter the first Name: ");
        String firstName = sc.next();
        String regex = "^[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (firstName.length() >= 3) {
            System.out.println("First name is " +matcher.matches());
        } else {
            System.out.println("Name is not valid");
        }
        System.out.println("Enter the last Name: ");
// Last Name validation
        String lastName = sc.next();
        if (lastName.length() >= 3) {
            System.out.println("Last name is " +pattern.matcher(lastName).matches());
        } else {
            System.out.println("Last name is not valid");
        }
// Email validation
        System.out.println("Enter the Email ");
        String email = sc.next();
        String emailRegex ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern1 = Pattern.compile(emailRegex);
        Matcher matcher1 = pattern1.matcher(email);
        if (email.matches(emailRegex)) {
            System.out.println("Entered Email is : " + matcher1.matches());
        } else {
            System.out.println("Email is not valid ! "+ "Please enter the valid email");
        }
 // mobile No. validation
        System.out.println("Enter the mobile no. ");
        String mobileNo= sc.next();
        String mobileRegex="^(91)?[6-9][0-9]{9}";
        Pattern pattern2=Pattern.compile(mobileRegex);
        Matcher matcher2=pattern2.matcher(mobileNo);
        if(mobileNo.equals(mobileRegex)){
            System.out.println("Entered mobile no. is "+matcher2.matches());
        }else{
            System.out.println("Mobile no. is not valid ");
        }
    }
}