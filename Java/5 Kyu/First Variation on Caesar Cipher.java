import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CaesarCipher {
  public static List<String> movingShift(String s, int shift) {
    //Phase 1: Encryption.
    char[] strArr = s.toCharArray(), strRe = new char[strArr.length];
    String convertStr = "";
    boolean specialCharCk = false;
    int plusIndex=shift, buffIndex = 0;
    int[] asciiNum = new int[strArr.length];
    for(int i=0;i<strArr.length;i++){
      asciiNum[i]=(int)strArr[i];
      if(plusIndex<0) plusIndex=buffIndex;
      if(asciiNum[i]<65 || (asciiNum[i]>90 && asciiNum[i]<97) || asciiNum[i]>122) {
        strRe[i]=(char)asciiNum[i];
        specialCharCk=true;
        plusIndex++;
      } else if((asciiNum[i]+plusIndex>90 && asciiNum[i]<91 && asciiNum[i]>64) || (asciiNum[i]+plusIndex>122 && asciiNum[i]>96 && asciiNum[i]<123)) {
        buffIndex=plusIndex+1;
        plusIndex-=26;
      }
      if(specialCharCk==false) strRe[i]=(char)(asciiNum[i]+plusIndex++);
      convertStr+=strRe[i];
      specialCharCk=false;
    }
        
    //Phase 2: Split into List<String>.
    int fivePartNum = 0, fourPartNum = 0, threePartNum = 0, fivePartCk = 0, fourPartCk = 0, threePartCk = 0, partFour = 0, partFive = 0;
    if(strArr.length%5==0) { 
      fivePartNum = strArr.length/5;
      fivePartCk = 1;
    } else if(strArr.length%4==0) {
      fourPartNum = strArr.length/4;
      fourPartCk = 1;
    } else{
      if(strArr.length%4<strArr.length/4) {
        fivePartCk=1;
        fourPartNum=(int)Math.ceil((double)strArr.length/5); 
        fivePartNum=strArr.length-fourPartNum*4;
      } else {
        fourPartCk=1;
        threePartNum=3;
        fourPartNum=2;
      }
    }
    String[] re = new String[]{};
    if(fivePartCk==1) {
      re = new String[]{"", "", "", "", ""};
      if(fourPartNum==0) {
        for(int i=0, j=fivePartNum, k=0;k<re.length;k++, i+=fivePartNum, j+=fivePartNum){
          re[k]+=convertStr.substring(i, j);
        }
      } else {
        for(int i=0, j=fourPartNum, k=0;k<re.length-1;k++, i+=fourPartNum, j+=fourPartNum){
          re[k]+=convertStr.substring(i, j);
        }
        re[4]=convertStr.substring(convertStr.length()-fivePartNum, convertStr.length());
      }
    } else if(fourPartCk==1) {
      re = new String[]{"", "", "", "", ""};
      if(threePartNum==0) {
        for(int i=0, j=fourPartNum, k=0;k<re.length-1;k++, i+=fourPartNum, j+=fourPartNum){
          re[k]+=convertStr.substring(i, j);
        }
        
      } else {
        for(int i=0, j=threePartNum, k=0;k<re.length-2;k++, i+=threePartNum, j+=threePartNum){
          re[k]+=convertStr.substring(i, j);
        }
        re[3]=convertStr.substring(convertStr.length()-fourPartNum-1, convertStr.length()-1);
      }
      re[4]="";
    }
    List<String> fRe = Arrays.asList(re);
    return fRe;
  }
  
  public static String  demovingShift(List<String> s, int shift) {
    String re = "";
    for(int i=0;i<s.size();i++) re+=s.get(i);
    char[] strArr = re.toCharArray(), strRe = new char[strArr.length];
    String convertStr = "";
    boolean specialCharCk = false;
    int plusIndex=-shift, buffIndex = 0;
    int[] asciiNum = new int[strArr.length];
    for(int i=0;i<strArr.length;i++){
      asciiNum[i]=(int)strArr[i];
      if(plusIndex>0) plusIndex=buffIndex;
      if(asciiNum[i]<65 || (asciiNum[i]>90 && asciiNum[i]<97) || asciiNum[i]>122) {
        strRe[i]=(char)asciiNum[i];
        specialCharCk=true;
        plusIndex--;
      } else if((asciiNum[i]+plusIndex<65 && asciiNum[i]<91 && asciiNum[i]>64) || (asciiNum[i]+plusIndex<97 && asciiNum[i]>96 && asciiNum[i]<123)) {
        buffIndex=plusIndex-1;
        plusIndex+=26;
      }
      if(specialCharCk==false) strRe[i]=(char)(asciiNum[i]+plusIndex--);
      convertStr+=strRe[i];
      specialCharCk=false;
    }
    return convertStr;
  }
}