package bookmanagement.bookauther;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    AuthService authService;

    @PostMapping("/add-book")
    public ResponseEntity addBook (@RequestBody Book book){
        String  response=authService.addBook(book);
        if(response==null) return new ResponseEntity("IT is already therre", HttpStatus.ALREADY_REPORTED);
        else return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @PostMapping("/add-auther")
    public ResponseEntity addAuther(@RequestBody Auther auther){
        String response=authService.addAuthor(auther);
        if(response==null) return new ResponseEntity("IT is already therre", HttpStatus.ALREADY_REPORTED);
        else return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @PostMapping("/addbookauth")
    public ResponseEntity addbookauth(@RequestBody Publish publish){
        String response=authService.addauthbook(publish);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @GetMapping("/getmaxpagesBook")
    public ResponseEntity getmaxpagesBook(){
        String response=authService.maxpagesbook();
        if(response==null) return new ResponseEntity<>("book noyt found",HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
    @GetMapping("/getAuthername")
    public  ResponseEntity getmaxpagesbookauthor(){
        String response=authService.getmaxpagesbookauthor();
        if(response==null) return new ResponseEntity<>("author not found",HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
    @PutMapping("/updateBook")
    public ResponseEntity updatebook(@RequestParam("b") String bookname,@RequestParam("p") int page){
        return new ResponseEntity<>(authService.updatepages(bookname, page),HttpStatus.ACCEPTED);
    }
}
