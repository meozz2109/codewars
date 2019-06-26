import java.util.List;
import java.util.*;
public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int b=0;
        for(int i=0;i<binary.size();i++){
            if(binary.get(i)==1)
                b+=Math.pow(2,binary.size()-i-1);
        }
        return b;
    }
}