class Solution {
    private String getfrequency(String str){
        int freq[]=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder frequencystring=new StringBuilder("");

        char c='a';
        for(int i: freq){
            frequencystring.append(c);
            frequencystring.append(i);
            c++;
        }
        return frequencystring.toString();

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        } 
        Map<String ,List<String>> freqstrmap=new HashMap<>();
        for(String str:strs){
            String freqstr= getfrequency(str);
            if(freqstrmap.containsKey(freqstr)){
                freqstrmap.get(freqstr).add(str);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(str);
                freqstrmap.put(freqstr,strList);
            }
        } 
    return new ArrayList<>(freqstrmap.values());
    }
}