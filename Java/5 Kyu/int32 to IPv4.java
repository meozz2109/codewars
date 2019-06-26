public class Kata {
  public static String repeatString(String s,int count){
    StringBuilder r = new StringBuilder();
    for (int i = 0; i < count; i++) r.append(s);
    return r.toString();
  }
	public static String longToIP(long ip) {
    String binaryForm = Long.toBinaryString(ip), res = "";
    int[] asciiNum = new int[4]; 
    if(binaryForm.length()%32!=0) binaryForm = repeatString("0", 32-binaryForm.length())+ binaryForm;
    for(int i=0, j=0, k=8;i<asciiNum.length;j+=8, k+=8, i++){
      asciiNum[i]=Integer.parseInt(binaryForm.substring(j,k), 2);
      res+=asciiNum[i]+".";
    }
	  return res.substring(0, res.length()-1);
	}
}