package Basics_of_software_code_development.Cycles;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        intersection(3215614,31651);
    }
    private static void intersection(int a, int b){
        ArrayList<Character> intersectionList = new ArrayList();

        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);

        for (int i = 0; i < stringA.length(); i++) {
            for (int j = 0; j < stringB.length(); j++) {
                if(stringA.charAt(i)==stringB.charAt(j)){
                    if(!intersectionList.contains(stringA.charAt(i)))
                        intersectionList.add(stringA.charAt(i));
                }
            }
        }
        for (int i = 0; i < intersectionList.size(); i++) {
            System.out.print(intersectionList.get(i)+" ");
        }
    }
}
