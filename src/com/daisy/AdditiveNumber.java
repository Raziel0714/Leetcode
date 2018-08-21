package com.daisy;

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num){
    if(num.length() < 3 || num == null) return false;

    int len = num.length();

    for(int i = 1; i < len - 1; i++){
        String s1 = num.substring(0, i);
        for(int j = i+1; j<len; j++){
            String s2 = num.substring(i, j);
            String s3 = num.substring(j, num.length());
            System.out.println("aaa "+s1 + " : " + s2 + " : " + s3);
            if((s2.length() > 1 && s2.charAt(0) == '0')) break;
            if(DFS(s1, s2, s3)) return true;
        }
        if(s1.length()>1 && s1.charAt(0) == '0') break;
    }
    return false;
    }

    public static boolean DFS(String s1, String s2, String s3) {
        if(s3.length() == 0) return true;
        if(s3.length() > 1 && s3.charAt(0) == '0') return false;
        String help = addStr(s1, s2);
        System.out.println("nnn "+ s1+ " : " + s2 + " : " + help);
        if(s3.length() < help.length()) return false;
        for(int i=0; i<help.length(); i++){
            if(help.charAt(i) != s3.charAt(i)) return false;
        }
        System.out.println("rrr "+ s2+ " : " + help + " : " + s3.substring(help.length(), s3.length()));
        return DFS(s2, help, s3.substring(help.length(), s3.length()));
    }

    public static String addStr(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int extra = 0; int len = Math.min(s1.length(), s2.length());
        int i = s1.length()-1; int j = s2.length()-1;
        int n1, n2;
        while(i>=0 || j>=0){
            if(i<0){
                n1 = 0;
            }else{
                n1 = s1.charAt(i--) - '0';
            }
            if(j<0){
                n2 = 0;
            }else{
                n2 = s2.charAt(j--) - '0';
            }
            sb.append((n1+n2+extra) % 10);
            if(n1 + n2 + extra>=10){
                extra = 1;
            }else extra = 0;
            System.out.println(sb.toString() + " " + n1+" " + n2 + " "+ extra);

        }
        if(extra == 1) sb.append('1');
        return sb.reverse().toString();
    }


    public boolean isAdditiveNumber1(String num){
        String a = "";
        String b = "";
        for(int i=0; i<=num.length()/2; i++){
            a = num.substring(0, i+1);
            if(a.length()>1 && a.charAt(0) == '0') continue;
            for(int j = i+1; j<num.length(); j++){
                b = num.substring(i+1, j+1);
                if(b.length()>1 && b.charAt(0) == '0') continue;
                if(Backtracking(num, a, b, j+1)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Backtracking(String num, String a, String b, int index){
        String sum = String.valueOf(Long.parseLong(a) + Long.parseLong(b));
        if(num.substring(index).length() < sum.length()) return false;
        if(num.substring(index).equals(sum)) return true;
        if(num.substring(index, index+sum.length()).equals(sum)){
            return Backtracking(num, b,sum,index+sum.length());
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isAdditiveNumber("101020305080130210"));
        //System.out.println(addStr("1", "99"));
    }
}
