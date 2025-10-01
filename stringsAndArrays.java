public class stringsAndArrays {

    public static void main(String[] args){
        String txt1 = "my name is Hannah";// Hannah starts at index 11 counting form zero, that is what 'indexOf' does in java.
        System.out.println(txt1.indexOf("Hannah"));// single codes are for character data types , double codes are for strings.
        System.out.println(txt1.charAt(1)); //because character data type can only take one charater, we can easily use it to get the index of a single character.
        String txt2 = "i am a dispenser of the God's grace";
        System.out.println(txt1.equals(txt2));// .equals() method compares the equality of two strings.
        System.out.println(txt1.trim());//removes leading and trailing widespaces.
         String txt3 = "  my name \\ is \"Hannah\"";
        System.out.println(txt3);// we dont normally use tripple code if we want to print a string of characters in double codes we use \"\".

        //Math method
        System.out.println(Math.pow(2,3));// this will always produce a double
        
        //RANDOM NUMBERS
        /*there is a difference between Math.random and the random class. for math.randome,
         * there is no need importing a class because math is part of the java.lang package which is automatically imported in every java program. 
         * 
         */
        
        int randomNumber = (int)(Math.random()*101);
        System.out.println(randomNumber);//also returns a double

        //JAVA CONDITIONS AND IF STATEMENTS
        
        

        

    }
}