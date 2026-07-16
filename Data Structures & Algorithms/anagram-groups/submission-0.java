class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        List <List<String>> res = new ArrayList<>();

        for(String ogString : strs) {
            char[] charArray = ogString.toCharArray();
            Arrays.sort(charArray);
            String sortedString = Arrays.toString(charArray);

            if(!map.containsKey(sortedString)) { // If map doesnt contain sorted String key
                map.put(sortedString, new ArrayList<>() ); // Add that sorted String key into map
                map.get(sortedString).add(ogString); // Then add og string to that sorted String key
            }

            else { // Map CONTAINS sorted String key
                map.get(sortedString).add(ogString); // Add og string to sortedString key
            }
        }

        for(String s : map.keySet()) { // For each string in keyset
            res.add(map.get(s)); // Add the list(ogStrings) at key s(sortedStrings) to res(list)
        }

        return res;
    }
}
