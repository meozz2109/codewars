public class ReverseWords{
 public static String reverseWords(String str){
  String fRe = "";
  for(int i=str.split(" ").length-1;i>=0;i--)
    fRe+=str.split(" ")[i]+" ";
  return fRe.substring(0, fRe.length()-1);
 }
}