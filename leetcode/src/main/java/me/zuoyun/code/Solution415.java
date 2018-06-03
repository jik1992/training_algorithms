package me.zuoyun.code;

/**
 * Created by ZuoYun on 2018/6/2. Time: 1:04 PM Information:
 */

public class Solution415 {

  public String addStrings(String num1, String num2) {

    String result = "";
    int position1 = num1.length()-1;
    int position2 = num2.length()-1;
    int count = 0;
    do {
      Integer a1 = 0, a2 = 0;
      if (position1 >= 0) {
        a1 = Integer.parseInt(String.valueOf(num1.charAt(position1)));
      }
      if (position2 >= 0) {
        a2 = Integer.parseInt(String.valueOf(num2.charAt(position2)));
      }

      Integer num = a1 + a2 + count;
      if (num >= 10) {
        num = num - 10;
        count = 1;
      } else {
        count = 0;
      }
      result = num.toString().concat(result);
      position1--;
      position2--;
    }
    while (position1 >=0  || position2 >= 0);

    if (count!=0){
      result="1".concat(result);
    }

    return result;

  }

  public static void main(String[] args) {
    System.out.println(new Solution415().addStrings("1","9"));
  }

}
