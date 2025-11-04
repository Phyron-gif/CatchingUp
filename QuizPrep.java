
import java.util.Scanner;
public class QuizPrep{
    public static void main(String[] args) {
       class IntergerDynamics{
        int minAcceptedValue;
        int maxAcceptedValue;
        String prompt;

            public IntergerDynamics(int min, int max, String prt) 
            {
                this.minAcceptedValue = min;
                this.maxAcceptedValue = max;
                this.prompt = prt;
            }
            public void setMaxAcceptedValue(int max){
                this.maxAcceptedValue = max;

            }
            public void setMinAcceptedValue(int min){
                this.minAcceptedValue = min;
            }
            public void setprompt(String prt){
                this.prompt = prt;
        
       } 
       public int getValue(){
        Scanner input = new Scanner(System.in);
        int value;
        while (true){
        System.out.println(prompt);

        value  = input.nextInt();
        
        if(value < minAcceptedValue || value > maxAcceptedValue){
            System.out.println("number is out of range please input again");
        
        }
        else{
            return value;

        }
        }
        //return 0;
        
        
       }
    }
    IntergerDynamics Value1 = new IntergerDynamics(-1,9,"enter a number");
    int number= Value1.getValue();
    System.out.println("you entered: "+ number);

}
}