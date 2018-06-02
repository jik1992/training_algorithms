package me.zuoyun.code;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZuoYun on 2018/5/28.
 * Time: 10:33 PM
 * Information:
 */

public class Solution771 {

  public int numJewelsInStones(String J, String S) {
    Set<String> stone = new HashSet<String>();
    for (int i = 0; i < J.length(); i++) {
      stone.add(String.valueOf(J.charAt(i)));
    }

    int value = 0;
    for (int i = 0; i < S.length(); i++) {
      if (stone.contains(String.valueOf(S.charAt(i)))) {
        value++;
      }
    }
    return value;

  }


}
