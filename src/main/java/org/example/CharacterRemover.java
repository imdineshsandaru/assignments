package org.example;

public class CharacterRemover {
    public String removeCharacters(String str, int startIndex, int numberOfCharacters){
        String output="";
        try {
            output = str.substring(0, startIndex) + str.substring(startIndex + numberOfCharacters);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return output;
    }
}
