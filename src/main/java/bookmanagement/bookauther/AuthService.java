package bookmanagement.bookauther;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    Reposetory reposetory;
    public String addBook(Book book){
        return reposetory.addBook(book);
    }
    public String addAuthor(Auther auther){
        return reposetory.addAuthor(auther);
    }
    public String addauthbook(Publish publish){
        return reposetory.addAutherBook(publish);
    }
    public String maxpagesbook(){
        return reposetory.findmaxpagesBook();
    }
    public String getmaxpagesbookauthor(){
        return reposetory.getAuther();
    }
    public  String updatepages(String book,int pages){
        return reposetory.updateBook(book,pages);
    }
}
