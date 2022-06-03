/*
The 2nd of February 2020 is a palindromic date in both dd/mm/yyyy and mm/dd/yyyy format (02/02/2020).
Given a date in dd/mm/yyyy format, return true if the date is palindromic in both date formats, otherwise return false.

Notes;
All dates will be valid in both date formats.
The date must be palindromic in both dd/mm/yyyy and mm/dd/yyyy formats to pass.
*/

palindromicDate("02/02/2020") ➞ true
palindromicDate("11/12/2019") ➞ false
palindromicDate("11/02/2011") ➞ false
// Although 11/02/2011 is palindromic in dd/mm/yyyy format,
// it isn't in mm/dd/yyyy format (02/11/2011)
  
  
  public class Challenge {
  public static boolean palindromicDate(String date) {
		String[] numbers = date.split("/");
		 
		String str1 = numbers[0] + numbers[1] + numbers[2];
		String str2 = numbers[1] + numbers[0] + numbers[2];
		
		return 
			new StringBuilder(str1).reverse().toString().equals(str1) &&
			new StringBuilder(str2).reverse().toString().equals(str2);
  }
}
