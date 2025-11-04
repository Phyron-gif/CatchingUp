
//public class midsemPrep{
    //public static void main(String[] args) {
      /*  int[][] myArrays= {
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };
    for (int i =0; i<myArrays.length;i++){
        int sum = 0;
        for (int j =0; j< myArrays[i].length; j++){
            myArrays[i][j]= myArrays[j][i];
        System.out.println("Row[" + i+"]"+"["+ j +"]" + "="+ myArrays[j][i] );
        
        sum += myArrays[i][j];
        
    }
    System.out.println(sum);
   
}
    
}
int[][] nums ={
    {10,20,30},
    {40,50,60},
} ;*/

/*Scanner input = new Scanner(System.in);
System.out.println("enter 9 numbers");
int[][] array = new int[3][4];
for (int i = 0; i < array.length; i++) {
    int   total=0;
    for (int j = 0; j<array[i].length;j++){
     
    array[i][j]= input.nextInt();
    
    total+= array[i][j];
   
    
}
 System.out.println(total);

System.out.println(Arrays.deepToString(array));




}

}
*/
/*hello("David",23);
int x= 3;
int y= 4;
int z = x+y;
System.out.println(z);

}
static void hello(String name, int age){
    System.out.println("hello "+ name +" " + age);


}
static int add(int x, int y){
    int z=x+y;
    return z;*/
   
    

public class midsemPrep{

   static class Car{
    private String name;
    private String colour;
    private String brand;
    private int number;

    public  Car(String name, String colour, String brand, int number){
        this.name = name;
        this.colour=colour;
        this.brand=brand;
        this.number = number;
    }
     void work(){
        System.out.println("my car name is "+ name + " with car number " + number+ " and brand "+ brand + " lastly with the colour "+ colour);

    }
     public static void main(String[] args) {
    Car car1 = new Car("SUV", "pink", "toyota",446);
    car1.work();
    }
    



    
}
}



   
