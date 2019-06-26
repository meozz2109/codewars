public class BuyCar {
	public static int[] nbMonths(int sPO, int sPN, int spM, double pLBM) {
    int i=1, s=0;
    double sPO1 = (double)Math.round(sPO);
    double sPN1 = (double)Math.round(sPN);
    while(s+sPO1<sPN1){
      sPO1 *= (100-pLBM)/100;
      sPN1 *= (100-pLBM)/100;
      i++;
      if(i%2==0) pLBM+=0.5;
      s+=spM;
    }
    return new int[]{ i-1, (int)Math.round(s+sPO1-sPN1)};
	}
}