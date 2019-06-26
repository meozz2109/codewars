public class Prime {
  public static boolean isPrime(int num) {
    for(int i = 2; i <= Math.sqrt(num); i++) 
        if (isPrime(i) && num%i == 0) return false;
    return (num>=2);
  }
}