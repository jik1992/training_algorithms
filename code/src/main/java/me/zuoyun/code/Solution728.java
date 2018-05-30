package me.zuoyun.code;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZuoYun on 2018/5/30.
 * Time: 1:49 PM
 * Information:
 */


public class Solution728 {

  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = left; i <= right; i++) {
      String num = Integer.toString(i);
      boolean isTrue = true;
      for (int j = 0; j < num.length(); j++) {
        Integer a = Integer.parseInt(String.valueOf(num.charAt(j)));
        if (a == 0 || i % a != 0) {
          isTrue = false;
          break;
        }
      }
      if (isTrue) {
        result.add(i);
      }

    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(JSON.toJSON(new Solution728().selfDividingNumbers(1, 22)));
  }


}
