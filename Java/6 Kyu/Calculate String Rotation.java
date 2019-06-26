public class CalculateRotation {
  static int shiftedDiff(String first, String second){
    for(int i=0;i<first.length();i++){
      String a = first.substring(first.length()-i, first.length())+first.substring(0, first.length()-i);
      if(a.equals(second)) return i;
    }
    return -1;
  }
}