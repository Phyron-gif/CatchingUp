public class lecture{
    public static void main(String[] args){
        class student{//the blueprint and attributes of the student
            int IdNumber;
            String name;
            String major;
            String FavouriteCaffeteria;
            student(int  Id, String  n, String  m, String  fc)//construct the student for me that builds the actual student.should always have same name as the class 
            {
                this.IdNumber = Id;
                this.name = n;
                this.major = m;
                this.FavouriteCaffeteria = fc;

            }
            void activities(){
                System.out.println("My name is " + name + " i am an Ashesi University student with student ID " + IdNumber + ", i major in "+ major +" and my favourite oncampus caffeteria is "+ FavouriteCaffeteria );


            }   
        }
        student Tracy = new student(46482028,"Tracy","computer science","hallmark");
        student Brenda = new student(46482027,"Brenda","Mechanical Engineering","Munchies");
        Tracy.activities();
        Brenda.activities();
       

    }
       
}