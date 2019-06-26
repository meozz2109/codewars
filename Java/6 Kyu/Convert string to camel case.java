class Solution{
  static String toCamelCase(String s){
    String pattern = "[\\W|\\_]", stringNote = "", re = "", patternRegexp1 = "(.*)\\_(.*)", patternRegexp2 = "(.*)\\-(.*)";
    String[] strArr = s.split(pattern);
    if(s.matches(patternRegexp1)||s.matches(patternRegexp2)){
      for(int i=1;i<strArr.length;i++){
        strArr[i] = strArr[i].toLowerCase();
        stringNote = strArr[i].substring(1,strArr[i].length());
        strArr[i] = strArr[i].split("")[0].toUpperCase() + stringNote;
      }
    }
    for(String str:strArr) re+=str;
    return re;
  }
}