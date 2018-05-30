package me.zuoyun.code;

/**
 * Created by ZuoYun on 2018/5/30.
 * Time: 2:42 PM
 * Information:
 */

public class Solution806 {

  public int[] numberOfLines(int[] widths, String S) {
    Integer line = 0;
    Integer lineWidth = 0;

    for (int i = 0; i < S.length(); i++) {
      int wordWidth = widths[(int) S.charAt(i) - 97];
      if (lineWidth + wordWidth <= 100) {
        lineWidth = lineWidth + wordWidth;
      } else {
        line++;
        lineWidth = wordWidth;
      }
    }
    return new int[]{line, lineWidth};
  }


}
