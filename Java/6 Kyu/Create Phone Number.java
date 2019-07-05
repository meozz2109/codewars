public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String s1 = ""+numbers[0]+numbers[1]+numbers[2], s2 = ""+numbers[3]+numbers[4]+numbers[5], s3 =""+numbers[6]+numbers[7]+numbers[8]+numbers[9], re = "("+s1+")"+" "+s2+"-"+s3;
    return re;
  }
}