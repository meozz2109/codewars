public class isogram {
    public static boolean isIsogram(String str) {
        str = str.toUpperCase();
        String[] arr = str.split("");
        for(int i=0;i<arr.length-1;i++)
          for(int j=i+1;j<arr.length;j++)
            if(arr[i].equals(arr[j])==true)
              return false;
        return true;
    } 
}