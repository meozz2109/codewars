class Solution {
  static int stray(int[] numbers) {
    int a=0, b=0;
    for(int i=0;i<numbers.length-1;i++)
      for(int j=i+1;j<numbers.length;j++)
        if(numbers[i]==numbers[j]){
          a = numbers[j];
        }
    for(int i=0;i<numbers.length;i++)
      if(numbers[i]!=a){
        b = numbers[i];
      }
    return b;
  }
}

