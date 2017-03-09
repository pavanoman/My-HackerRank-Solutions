// https://www.hackerrank.com/challenges/java-anagrams



    static boolean isAnagram(String a, String b) {
        
  
        //converting strings to array and removing case sensitivity
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        
        //sorting
        Arrays.sort(first);
        Arrays.sort(second);
        
        if(Arrays.equals(first, second)) {
            return true;
        } else {
            return false;
        }
 
        
    }
