import java.util.HashMap;

public class Library{
  
  Library(){}
  
  public void getFinishedBooks(HashMap<String, Boolean> library){
    
    if (library.size() < 1){
      System.out.println("HashMap is empy!");
    }
    
    else{
      for (String book:library.keySet()){
        if (library.get(book) == true){
          System.out.println(book);
        }
      }
    }
    
  }
  
  public void getIncompleteBooks(HashMap<String, Boolean> library){
    
    if (library.size() < 1){
      System.out.println("HashMap is empy!");
    }
    
    else{
      for (String book:library.keySet()){
        if (library.get(book) == false){
          System.out.println(book);
        }
      }
    }
    
  }
  
  // Main method
  public static void main(String[] args){
    
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    
    myBooks.put("Road Down the Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    System.out.println("FINISHED:");
    myLibrary.getFinishedBooks(myBooks);
    System.out.println("NOT READ YET:");
    myLibrary.getIncompleteBooks(myBooks);
    
  }
}