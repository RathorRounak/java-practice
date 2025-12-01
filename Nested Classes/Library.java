// Write a Java program to create an outer class called Library with an instance variable libraryName. Create an inner class Book with a method getLibraryName() that returns the name of the library. Instantiate the Book class and call the getLibraryName() method.
class Library {

    String libraryName;
    class Book{

       String getLibraryName(){
           return "Central library";
        }
    }
    
    public static void main(String[] rounak) {
        Library l = new Library();
        Library.Book b = l.new Book();

        l.libraryName = b.getLibraryName();
        System.out.println("library Name = "+ l.libraryName);


        
        
    }
    
}
