package me.zuoyun.code;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZuoYun on 2018/5/30.
 * Time: 2:50 PM
 * Information:
 */

public class Solution811 {

  private void count(Map<String, Integer> result, String word, Integer pv) {
    if (result.get(word) == null) {
      result.put(word, pv);
    } else {
      result.put(word, result.get(word) + pv);
    }
  }

  public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> statistics = new HashMap<String, Integer>();
    for (String cpdomain : cpdomains) {
      String[] cpd = cpdomain.split(" ");
      Integer pv = Integer.parseInt(cpd[0]);
      String domain = cpd[1];
      String[] subDomain = domain.split("\\.");
      if (subDomain.length == 3) {
        count(statistics, subDomain[0] + "." + subDomain[1] + "." + subDomain[2], pv);
        count(statistics, subDomain[1] + "." + subDomain[2], pv);
        count(statistics, subDomain[2], pv);
      } else if (subDomain.length == 2) {
        count(statistics, subDomain[0] + "." + subDomain[1], pv);
        count(statistics, subDomain[1], pv);
      }
    }

    List<String> result = new ArrayList<String>();
    for (String word : statistics.keySet()) {
      result.add(statistics.get(word) + " " + word);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(JSON.toJSON(new Solution811().subdomainVisits(new String[]{"9001 discuss.leetcode.com"})));
  }
}
