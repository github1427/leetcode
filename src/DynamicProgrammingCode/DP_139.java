package DynamicProgrammingCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 单词拆分
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * <p>
 * 说明：
 * <p>
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 * <p>
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 * <p>
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 * 注意你可以重复使用字典中的单词。
 * 示例 3：
 * <p>
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 */
public class DP_139 {
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(wordBreak(s, list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] memo = new boolean[len + 1];
        memo[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[i]) {
                    break;
                }
                memo[i] = memo[j] && wordDict.contains(s.substring(j, i));
            }
        }
        return memo[len];
    }
}
