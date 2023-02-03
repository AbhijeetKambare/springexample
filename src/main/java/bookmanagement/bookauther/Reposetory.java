package bookmanagement.bookauther;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class Reposetory {
    HashMap <String,Book> bookmap=new HashMap<>();
    HashMap<String,Auther> authormap=new HashMap<>();
    HashMap<Auther,Book> autherBookHashMap=new HashMap<>();
    public String addBook(Book book){
        if(!bookmap.containsKey(book.getName())){
            bookmap.put(book.getName(),book);
            return "Book added succesfully";
        }
        else return null;
    }
    public String addAuthor(Auther auther){
        if (!authormap.containsKey(auther.getName())){
            authormap.put(auther.getName(),auther);
            return "Author is added Succesfully";
        }
        else {
            return null;
        }

    }
    public String addAutherBook(Publish publish){
        autherBookHashMap.put(publish.getAuther(),publish.getBook());
        return "added";
    }
    public String findmaxpagesBook(){
      int max=0;
       for (String name:bookmap.keySet()){
           Book book=bookmap.get(name);
           max=Math.max(max,book.getPages());
       }
        for(String name:bookmap.keySet()){
            int bookpages=bookmap.get(name).getPages();
            if(max==bookpages)
                return name;
        }
         return null;
    }
    public String getAuther(){
        int max=0;
        for (String name:bookmap.keySet()){
            Book book=bookmap.get(name);
            max=Math.max(max,book.getPages());
        }
        for(String name:bookmap.keySet()){
            int bookpages=bookmap.get(name).getPages();
            if(max==bookpages)
                return bookmap.get(name).getAuthor_name();
        }
        return null;
    }
    public String updateBook(String book,int pages){
        bookmap.get(book).setPages(pages);
        return "Succesfully updated";
    }
}
