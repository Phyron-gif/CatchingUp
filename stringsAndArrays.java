public class stringsAndArrays {

    public static void main(String[] args){
        String txt1 = "my name is Hannah";// Hannah starts at index 11 counting form zero, that is what 'indexOf' does in java.
        System.out.println(txt1.indexOf("Hannah"));// single codes are for character data types , double codes are for strings.
        System.out.println(txt1.charAt(1)); //because character data type can only take one charater, we can easily use it to get the index of a single character.
        String txt2 = "i am a dispenser of the Grace God";
        System.out.println(txt1.equals(txt2));// .equals() method compares the equality of two strings.
        System.out.println(txt1.trim());//removes leading and trailing widespaces.
         String txt3 = "  my name is \"Hannah\"";
        System.out.println(txt1);// we dont normally use tripple code if we want to print a string of characters in double codes we use \"\".

    }
}