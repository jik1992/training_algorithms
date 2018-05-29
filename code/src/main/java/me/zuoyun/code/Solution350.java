package me.zuoyun.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZuoYun on 2018/5/29.
 * Time: 10:52 AM
 * Information:
 */

public class Solution350 {

  public int[] intersect(int[] nums1, int[] nums2) {

    if (nums1.length==0 || nums2.length==0) return new int[0];

    List<Integer> nums1Set = new ArrayList<Integer>();
    List<Integer> nums2Set = new ArrayList<Integer>();

    for (int i : nums1) {
      nums1Set.add(i);
    }
    for (int i : nums2) {
      nums2Set.add(i);
    }

    if (nums2.length > nums1.length) {
      nums2Set.retainAll(nums1Set);
    } else {
      nums1Set.retainAll(nums2Set);
    }

    Integer[] result = new Integer[nums1Set.size()];
    nums1Set.toArray(result);

    int[] r = new int[result.length];
    for (int i = 0; i < r.length; i++) {
      r[i] = result[i];
    }

    return r;
  }


}
