public class Kata {
  public static String HighAndLow(String numbers) {
    String s = "";
    int b;
    String[] a = numbers.split("\\s");
    int[] c = new int[a.length];
    for(int i=0;i<a.length;i++) c[i]=Integer.parseInt(a[i]);
    for(int i=0;i<c.length-1;i++)
      for(int j=i+1;j<c.length;j++)
        if(c[i]<c[j]){
          b = c[i];
          c[i] = c[j];
          c[j] = b;
        }
    s+=c[0]+" "+c[c.length-1];
    return s;
  }
}
