package me.zuoyun.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by ZuoYun on 2018/6/3. Time: 9:41 PM Information:
 */
@Deprecated
public class Solution594 {


  public int findLHS(int[] nums) {
    List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedList::new));
    Integer max = 0;
    Integer tempMax = 0;
    boolean good = false;
    Set<Integer> dict = new HashSet<>(numsList);
    for (Integer integer : dict) {

      int position = 1;

      boolean find = false;

      for (int i = 0; i < numsList.size() - max + 1; i++) {
        if (numsList.get(i).equals(integer)) {
          position = i;
          find = true;
          break;
        }
      }

      if (!find) {
        return max;
      }

      tempMax = 1;

      for (int i = position + 1; i < numsList.size(); i++) {
        if (numsList.get(i).equals(integer + 1) || numsList.get(i).equals(integer)) {
          tempMax++;
          if (numsList.get(i) == integer + 1) {
            good = true;
          }
        }
      }
      if (tempMax > max && good) {
        max = tempMax;
      }

      tempMax = 1;
      for (int i = position + 1; i < numsList.size(); i++) {
        if (numsList.get(i).equals(integer - 1) || numsList.get(i).equals(integer)) {
          tempMax++;
          if (numsList.get(i) == integer - 1) {
            good = true;
          }
        }
      }
      if (tempMax > max && good) {
        max = tempMax;
      }

    }

    return max;
  }


  public static void main(String[] args) {
    System.out.println(new Solution594().findLHS(new int[]{3, 2, 1}));
  }
}
