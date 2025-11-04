public class Library {
    public static void main(String[] args) {
        System.out.println("Welcome to the my library");
       // Library libraryInfo = new Library();
        //libraryInfo.name = "Ashesi University Library";
        //libraryInfo.location = "Berekuso hills.";
        //libraryInfo.foundingYear =2002;
        Library lib = new Library("Ashesi library", "Berekuso", 2002);
        //System.out.println("The library is called " +  name + " founded in the year " + foundingYear + " and its located at " + location );
        //lib.speak();
         System.out.println("my name is " + lib.getName() + " founded since "+ lib.getFoundingYear() + " located at " +lib.getLocation() );
       
        lib.setName("KNUST Library");
        lib.setLocation("Kumasi");
        lib.setFoundingYear(1999);
        System.out.println("my name is " + lib.getName() + " founded since "+ lib.getFoundingYear() + " located at " +lib.getLocation() );
        Book book1 = new Book("Good morning Holy Spirit", "Benny Hinn", 1990, "Yes");
        System.out.println("The title of the book is "+ book1.getTitle() + ",authored by "+ book1.getAuthor() + " in the year "+ book1.getYearPublished()+". " +" it's availability status is "+ book1.getAvalable());
         System.out.println("Updated year of publish:");
        book1.setYearPublished(2025);
        
        System.out.println("The title of the book is "+ book1.getTitle() + ",authored by "+ book1.getAuthor() + " in the year "+ book1.getYearPublished()+". " +" it's availability status is "+ book1.getAvalable());
        
       

        
        

    }
     static class Book{
        private String title;
        private String author;
        private int yearPublished;
        private String available;
        Book(String title, String author, int yearPublished, String available){
            this.title = title;
            this.author = author;
            this.yearPublished= yearPublished;
            this.available = available;

        }
        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public int getYearPublished(){
            return yearPublished;
        }
        public String getAvailable(){
            return available;
        }
        public void setTitle(String title){
            this.title = title;
        }
         public void setAuthor(String author){
            this.author = author;
           
        }
         public void setYearPublished(int yearPublished){
            if(yearPublished > 1500 && yearPublished < 2025){
                this.yearPublished = yearPublished;
            }
            else{
                System.out.println("invalid year of publish. try again");
            }
            
        }
         public void setAvalable( String available){
            this.available = available;
           
        }

    }
   private String name;
   private String location;
    private int foundingYear;
    Library(String name, String location, int foundingYear ){
        this.name = name;
        this.location= location;
        this.foundingYear=foundingYear;

    }

   // public Library() {
        
   // }
    
    public String getName(){
       return name;
    }
    public String getLocation(){
        return location;
    }
    public int getFoundingYear(){
        return foundingYear;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setFoundingYear(int foundingYear){
        if (foundingYear > 1999 && foundingYear < 2025 ){
        this.foundingYear = foundingYear;
        }
        else{
            System.out.println("invalid founding year. Please try again ");
        }
    }

    
}
    class DigitalLibrary extends Library{

    public DigitalLibrary(String name, String location, String foundingYear) {
        super("tracy", null, 0);
    }
        
    

}


