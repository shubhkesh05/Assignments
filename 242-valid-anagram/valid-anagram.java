class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
             map.put(i,map.getOrDefault(i,0)-1);
        }
        for(int i:map.values()){
        if(i!=0){
            return false;
        }
        }
        return true;
    }
}