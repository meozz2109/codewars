public class BitCounting {
	public static int countBits(int n){
		String a=Integer.toString(n, 2);
    	int count=0;
	    char[] b = a.toCharArray();
	    for(int i:b) if(i=='1') count++;
	    return count;
	}
}