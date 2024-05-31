package org.example;

public class LengthOfLastString {

    public int lengthOfLastWord(String s) {

        String[] strings= s.replaceAll(" +"," ").split(" ");
        return strings[strings.length-1].length();

    }

    public static void main(String []args){
        String s = "   fly me   to   the moon  ";
        LengthOfLastString l=new LengthOfLastString();
        l.lengthOfLastWord(s);
    }
}
