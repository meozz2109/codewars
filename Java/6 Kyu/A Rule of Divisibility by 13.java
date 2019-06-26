class Thirteen {
    public static long thirt(long n) {
      String x = "";
      int sum=0, j=0;
      x+=n;
      String[] arr = x.split("");
      long[] arr1 = new long[]{1, 10, 9, 12, 3, 4};
      for(int i=arr.length-1;i>=0;i--){
        if(j==6) j=0;
        sum+=Long.parseLong(arr[i])*arr1[j++];
      }
      if(sum>=100) sum=(int)thirt((long)sum);
      return (long)sum;
    }
}