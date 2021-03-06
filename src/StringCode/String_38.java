package StringCode;

/**
 * 报数
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 */
public class String_38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        String[] strings = new String[n];
        strings[0] = "1";
        for (int i = 1; i < n; i++) {
            strings[i] = say(strings[i - 1]);
        }
        return strings[n - 1];
    }

    private static String say(String str) {
        String s = "";
        int count = 1;
        char[] chars = str.toCharArray();
        char ele=chars[0];
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                s = s + count + ele;
                count = 1;
                ele = chars[i+1];
            }
        }
        return s+count+ele;
    }
}
