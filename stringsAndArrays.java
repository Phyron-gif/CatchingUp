import java.util.Arrays;
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
    /*
     * we use the If statement to execute a block of code with a specific condition being true.
     * we use the else if to execute a different block of code if the condition of the if statement is false.
     * we use the else to exucute a dufferent block of code with a new condition if the first conditions are false.
     * we use a switch to specify or carry out the operation of multiple else if statement.
     * the Tenary operators is used to replace multiple lines of code with a single line. it is most often used to replace simple if else statements
     * variable = (condition)? expressionTrue : espressionFalse;
     */
    //Normal if and else
    int time = 20;
    if (time<18){
        System.out.println("Good day");  
    }
    else{
                System.out.println("Good evening");
    }
        //Tenary
        int time2 = 20;
        String result = (time<18)? "Good day":"Good evening";
                System.out.println(result);
        

       /*
       NESTED IFS
       it let you check for a condition only if another condition is true
        */ 
    int[] num = {1,2,3,4};
    for (int i = 0; i<num.length;i++){
        

    }
System.out.println(Arrays.toString(num));
    }
}