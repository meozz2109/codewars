import java.util.List;
import java.util.ArrayList;
public class PrimeDecomp {
    public static boolean isPrime(int num) {
      for(int i = 2; i <= Math.sqrt(num); i++) 
          if (isPrime(i) && num%i == 0) return false;
      return (num>=2);
    }
    public static String factors(int n) {
      String re = "";
      int num = n, k = 0;
      List<Long> primeNum = new ArrayList<>(), mainNum = new ArrayList<>();
      if (isPrime(num)) return "(" + num + ")";
      for (int i = 0; i < Math.sqrt(n); i++) 
        if (isPrime(i)) primeNum.add((long) i);
      for (int i = 0; i < primeNum.size(); i++)
        if (n % primeNum.get(i) == 0) {
          mainNum.add(primeNum.get(i));
          n /= primeNum.get(i);
        }
      int[] t = new int[mainNum.size()];
      for (int i = 0; i < t.length; i++) t[i] = 1;
      for (; k < mainNum.size(); k++) {
        if(isPrime(n) && n >Math.sqrt(num)){
          for(int i=0;i<mainNum.size(); i++) {
            if (t[i] == 1) re += "(" + mainNum.get(i) + ")";
            else re += "(" + mainNum.get(i) + "**" + t[i] + ")";
          }
          re += "("+n+")";
          return re;
        }
        if (n % mainNum.get(k) == 0) {
          n /= mainNum.get(k);
          t[k]++;
        }
        if (k == mainNum.size() - 1 && n != 1) k = -1;
      }
      for (int i = 0; i < mainNum.size(); i++) {
        if (t[i] == 1) re += "(" + mainNum.get(i) + ")";
        else re += "(" + mainNum.get(i) + "**" + t[i] + ")";
      }
      return re;    
    }
}