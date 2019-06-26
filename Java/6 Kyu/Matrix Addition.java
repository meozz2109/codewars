public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
	    int m=a.length, n=a[0].length;
	    int[][] c = new int[m][n];
	    for(int i=0;i<m;i++)
	    for(int j=0;j<n;j++)
	      c[i][j]=a[i][j]+b[i][j];
	    return c;
	}
}