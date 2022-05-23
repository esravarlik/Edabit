/*
The string must contain an @ character.
The string must contain a . character.
The @ must have at least one character in front of it.
e.g. "e@edabit.com" is valid while "@edabit.com" is invalid.
The . and the @ must be in the appropriate places.
e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid.
*/


public class Program {
    public static boolean validateEmail(String s) {
      return s.contains("@") && s.endsWith(".com")
			&& s.charAt(0) != '@' && s.charAt(0) != '.' && 
			java.lang.Math.abs(s.indexOf('.') - s.indexOf('@')) > 1;
    }

  

  
import java.util.regex.*;

public class Program {
    public static final Pattern VALID_EMAIL_FORMAT = 
	    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
    public static boolean validateEmail(String s) {
        Matcher matcher = VALID_EMAIL_FORMAT.matcher(s);
        return matcher.find();
    }
}
