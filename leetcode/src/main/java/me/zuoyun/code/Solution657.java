package me.zuoyun.code;

/**
 * Created by ZuoYun on 2018/5/28.
 * Time: 10:22 PM
 * Information:
 */

class Solution657 {

  public boolean judgeCircle(String moves) {
    int[] step = new int[2];
    step[0] = 0;
    step[1] = 0;
    for (int i = 0; i < moves.length(); i++) {
      char forward = moves.charAt(i);
      switch (forward) {
        case 'R': {
          step[0]++;
          break;
        }
        case 'L': {
          step[0]--;
          break;
        }
        case 'U': {
          step[1]++;
          break;
        }
        case 'D': {
          step[1]--;
          break;
        }
        default:
          break;
      }
    }
    return step[0] == 0 && step[1] == 0;
  }

  public static void main(String[] args) {
    System.out.println(new Solution657().judgeCircle("LL"));;
  }
}