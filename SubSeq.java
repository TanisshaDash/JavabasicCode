import java.util.*;

 public class SubSeq {

 public static void printSubseq(String str, int idx, String res) {
    if(idx == str.length()) {
    System.out.println(res);
    return;
    }

    //chooses
    printSubseq(str, idx+1, res+str.charAt(idx));


    //does not  choose
    printSubseq(str, idx+1, res);
    }
    public static void main(String args[]) {
    String str1 = "tan";
    String str2 = "aaa";
    printSubseq(str1, 0, "");
    }
    }