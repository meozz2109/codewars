public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
    String pattern = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";
    return phoneNumber.matches(pattern);
  }
}