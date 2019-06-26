public class Sum {
     public int GetSum(int a, int b){
      int c=a;
      if(b==a) return a;
      while(a>b){
        a--;
        c+=a;
      }
      while(a<b){
        a++;
        c+=a;
      }
      return c;
     }
  }