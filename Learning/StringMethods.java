package Learning;

import java.util.Arrays;

public class StringMethods {
   public static void main(String[] args) {
    String name = "Harshith";
    String empty = " ";

    //Basic inspection methods
    System.out.println(name.length());

    if(name.isEmpty()) System.out.println("is empty");
    System.out.println("not empty or balnk");

    if(empty.isBlank()){
        System.out.println("blank");
    } else
    System.out.println("not balnk");


    System.out.println('H' == name.charAt(0));


    //Comparision methods

    System.out.println(name.equals("Harshith")); //true
    System.out.println(name.equalsIgnoreCase("hARSHITH")); //true

    String S1 = "     Apple";
    String S2 = "Drange";
    String S3 = "Apple and orange";
    System.out.println("compar to " + S1.compareTo(S2));

    System.out.println(S1.contains(S2));

    System.out.println(S1.startsWith("A"));

     System.out.println(S1.endsWith("E".toLowerCase()));

     System.out.println(S1);  //without trim

     System.out.println(S1.trim()); // with trim

     System.out.println(S1);
      System.out.println(S1.strip());

    System.out.println(S3.substring(6));

    System.out.println(S3.replace("Apple", "Harshith"));

    System.out.println(S3.indexOf("o"));

    String[] A1 = S3.split(",");

    System.out.println(Arrays.toString(A1));

}
}