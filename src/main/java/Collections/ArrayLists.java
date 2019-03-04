package Collections;

import org.omg.PortableInterceptor.INACTIVE;

import java.awt.*;
import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Integer sum =0;
        for(Integer i : list1)
            sum+= i;
        for (Integer i :list2)
            sum += i;
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {

        original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        for(int i = 1; i < original.size(); i++){
            ArrayList<Character> lastChars = characterArrayListMaker(original.get(i-1));
            ArrayList<Character> currentChars = characterArrayListMaker(original.get(i));
            boolean compareFlag = false;
            for(Character last : lastChars){
                for(Character current : currentChars){
                    if (last.equals(current)){
                        compareFlag = true;
                    }
                }
            }
            if(!compareFlag){
                return false;
            }
        }
        return true;
    }

    private ArrayList<Character> characterArrayListMaker(String s) {
        ArrayList<Character> result = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++){
            result.add(s.charAt(i));
        }
        return result;
    }

}
