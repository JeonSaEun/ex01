package Chap4;

public class IsAnagram {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b = b.toLowerCase();
        
        //-------------------------------------------------//
        java.util.List<Character> listA = new java.util.ArrayList<>();
        java.util.List<Character> listB = new java.util.ArrayList<>();
        
        for(int i=0;i<a.length();i++) {
            listA.add(a.charAt(i));
        } // enhanced for
        
        for(int i=0;i<b.length();i++) {
            listB.add(b.charAt(i));
        } // enhanced for
        
        //-------------------------------------------------//
        
        java.util.Set<Character> setA = new java.util.TreeSet<>(listA);
        java.util.Set<Character> setB = new java.util.TreeSet<>(listB);

        if(!setA.equals(setB)) {
            setA.clear(); setB.clear();
            listA.clear(); listB.clear();

            return false;
        } // if
        
        //-------------------------------------------------//
        int[] freqA = new int[setA.size()];
        int[] freqB = new int[setB.size()];
        
        int index = 0;
        for(char ch : setA) {
            freqA[index++] = java.util.Collections.frequency(listA, ch);
        } // enhanced for
        
        index = 0;
        for(char ch : setB) {
            freqB[index++] = java.util.Collections.frequency(listB, ch);
        } // enhanced for
        
        setA.clear(); setB.clear();
        listA.clear(); listB.clear();
        
        //-------------------------------------------------//
        return java.util.Arrays.equals(freqA, freqB) ? true : false;

    } // isAnagram

} // end class
