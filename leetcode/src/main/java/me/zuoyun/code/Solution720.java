package me.zuoyun.code;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZuoYun on 2018/6/3. Time: 7:44 PM Information:
 */

public class Solution720 {

  public String longestWord(String[] words) {

    Set<String> sub = new HashSet<>(Arrays.asList(words));
    String ans = "";


    for (String word : sub) {
      if (word.length() > ans.length() || word.length() == ans.length() && word.compareTo(ans) < 0) {
        boolean good = true;
        for (int i = 1; i < word.length(); i++) {
          if (!sub.contains(word.substring(0, i))) {
            good = false;
            break;
          }
        }
        if (good) {
          ans = word;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(JSON.toJSON(new Solution720().longestWord(new String[]{"w", "wo", "wor", "worl", "world"})));
  }
}
