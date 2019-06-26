public class ASum {	
	public static long findNb(long m) {
	    for(int i=1;i<=m;i++){
	      m -= (long)Math.pow(i, 3);
	      if(m==0) return (int)i;
    	}
    	return -1;
	}	
}