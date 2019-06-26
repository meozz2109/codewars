public class NumberFun {
  public static long findNextSquare(long sq) {
      if ((long)Math.sqrt(sq)*(long)Math.sqrt(sq)!=sq) return -1;
      long a = (long)Math.sqrt(sq)+1;
      return (long)Math.pow(a,2); 
  }
}