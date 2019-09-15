package t1169;

import java.util.*;

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        //存放要删除的交易的索引
        Set<Integer> delSet = new HashSet<Integer>();
        //同名可能有多条记录，这里使用 Map<String, List<Pair>>
        Map<String, List<Pair>> dataMap = new HashMap<String, List<Pair>>();

        int len = transactions.length;
        for (int i = 0; i < len; i++) {
            Pair pair = new Pair(i, transactions[i]);
            //交易金额超过 ¥1000
            if (pair.amount > 1000) {
                delSet.add(pair.idx);
            }
            //它和另一个城市中同名的另一笔交易相隔不超过 60 分钟（包含 60 分钟整）
            if (!dataMap.containsKey(pair.name)) {
                dataMap.put(pair.name, new ArrayList<Pair>());
            } else {
                List<Pair> list = dataMap.get(pair.name);
                for (Pair p : list) {
                    //如果它和另一个城市中同名的另一笔交易相隔不超过 60 分钟（包含 60 分钟整）
                    if (!p.city.equals(pair.city) && Math.abs(p.time - pair.time) <= 60) {
                        delSet.add(p.idx);
                        delSet.add(pair.idx);
                    }
                }
            }
            dataMap.get(pair.name).add(pair);
        }

        //返回结果
        List<String> ansList = new ArrayList<String>();
        for (Integer idx : delSet) {
            ansList.add(transactions[idx]);
        }

        return ansList;
    }

    class Pair {
        int idx;
        String name;
        int time;
        int amount;
        String city;

        public Pair(int idx, String str) {
            String[] arr = str.split(",");
            this.idx = idx;
            this.name = arr[0];
            this.time = Integer.parseInt(arr[1]);
            this.amount = Integer.parseInt(arr[2]);
            this.city = arr[3];
        }
    }
}