package Hacker_rank;
import java.util.*;
import java.util.regex.*;

class MyRegex {
    String num = "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})";
    String pattern = "^" + num + "\\." + num + "\\." + num + "\\." + num + "$";
}

public class MyregexTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern p = Pattern.compile(myRegex.pattern);

        while (sc.hasNext()) {
            String ip = sc.next();
            System.out.println(p.matcher(ip).matches());
        }
        sc.close();
    }
}
