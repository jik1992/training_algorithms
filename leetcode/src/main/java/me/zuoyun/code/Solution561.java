package me.zuoyun.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZuoYun on 2018/5/30.
 * Time: 2:29 PM
 * Information:
 */

public class Solution561 {

  public int arrayPairSum(int[] nums) {
    List<Integer> sort = new ArrayList<Integer>();
    for (int num : nums) {
      sort.add(num);
    }
    Collections.sort(sort);
    Integer total = 0;
    for (int i = 0; i < sort.size(); i++) {
      if (i % 2 == 0) {
        total += sort.get(i);
      }
    }
    return total;
  }

}
