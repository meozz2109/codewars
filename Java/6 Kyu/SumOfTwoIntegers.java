// Sum of Two Integers :
// Given Two integers a , b , find The sum of them , BUT You are not allowed to use the operators + and -

public class Solution
{
    public static int add(int x, int y)
    {
    	if(y == 0) {
      		return x;
    	}
    	else {
        	return add( x ^ y, (x & y) << 1);
    	}
    }
}