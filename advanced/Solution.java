package advanced;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        List<String> lis = new ArrayList<>(Arrays.asList("hot","dot", "dog", "lot", "log", "cog"));
//        List<String> lis = new ArrayList<>(Arrays.asList("a", "b", "c"));


    int output = ladderLength("hit", "cog", lis);
 //      int output = ladderLength("a", "c", lis);
        System.out.println("output " + output);
    }
    public  static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        //create graph//adjacent list
        //loop through each word
        Map<String, List<String>> adj = new HashMap<>();

        if(!wordList.contains(beginWord)){
            wordList.add(0, beginWord);
        }


        for(int i = 0; i< wordList.size(); i++){
            String key = wordList.get(i);
            for(int j = 0; j<wordList.size(); j++){
                if(i == j)
                    continue;

                //make sure the word is only one letter different from key
                if(isOneCharacterDiff(key, wordList.get(j))) {
                    if(adj.containsKey(key)){
                        List<String> l = adj.get(key);
                        l.add(wordList.get(j));
                        adj.put(key, l);
                    }
                    else{
                        List<String> l = new ArrayList<>();
                        l.add(wordList.get(j));
                        adj.put(key, l );
                    }
                }
            }
        }

        System.out.println(adj);


        //adj
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        queue.add(beginWord);
        visited.add(beginWord);
        int count = 0;
        while (!queue.isEmpty()){
            String k = queue.poll();

            count = count +1;
            for (String s: adj.get(k)){
                if(s.equals(endWord)) {
                    parent.put(s, k);
                    System.out.println("parent" + parent);
                    return count+1;
                }
                if(!visited.contains(s) && !queue.contains(s)){
                    queue.add(s);
                    visited.add(s);
                    parent.put(s, k);
                }
            }

        }

        return 0;
    }

    static boolean isOneCharacterDiff(String a, String b){
        int count = 0;
        for(int i = 0; i< a.length(); i++){
            if(a.charAt(i) != b.charAt(i))
                count++;
            if(count >1)
                return false;
        }
        return true;
    }
}