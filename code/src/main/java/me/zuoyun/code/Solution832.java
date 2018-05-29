package me.zuoyun.code;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZuoYun on 2018/5/28.
 * Time: 10:51 PM
 * Information:
 */
class Solution832 {

  public int[][] flipAndInvertImage(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      int[] row = A[i];
      List<Integer> rowArray = new ArrayList<Integer>();
      for (int i1 : A[i]) {
        rowArray.add(i1);
      }
      Collections.reverse(rowArray);
      for (int j = 0; j < A[i].length; j++) {
        A[i][j] = rowArray.get(j) == 1 ? 0 : 1;
      }
    }

    return A;
  }

  public static void main(String[] args) {
    int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    System.out.println(JSON.toJSON(new Solution832().flipAndInvertImage(A)));
  }
}