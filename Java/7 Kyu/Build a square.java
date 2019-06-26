public class Kata {
    public static String repeatString(String s,int count){
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < count; i++) {
            r.append(s);
        }
        return r.toString();
    }
    public static final String generateShape(int n) {
        if(n<=0) return "";
        String re = repeatString("+", (int)Math.pow(n,2));
        char[] ch = re.toCharArray();
        String fRe = "";
        for(int i=0;i<ch.length;i++){
            if(i%n==0) fRe+="\n";
            fRe+=ch[i];
        }
        return fRe.substring(1);
    }
}