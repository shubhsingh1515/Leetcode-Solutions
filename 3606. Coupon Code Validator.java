import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        Map<String, List<String>> map = new HashMap<>();
        for (String key : order.keySet()) {
            map.put(key, new ArrayList<>());
        }

        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (!order.containsKey(businessLine[i])) continue;
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!code[i].matches("^[a-zA-Z0-9_]+$")) continue;
            map.get(businessLine[i]).add(code[i]);
        }

        List<String> result = new ArrayList<>();
        List<String> keys = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");

        for (String key : keys) {
            List<String> list = map.get(key);
            Collections.sort(list);
            result.addAll(list);
        }

        return result;
    }
}
