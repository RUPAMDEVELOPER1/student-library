package MajorProject1com.example.Student_LbraryManagmentSystem.Services;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Author;
import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Book;
import MajorProject1com.example.Student_LbraryManagmentSystem.Repository.AuthorRepository;
import MajorProject1com.example.Student_LbraryManagmentSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    @Autowired
    //BookRepository bookRepository;
    AuthorRepository authorRepository;

    public String CreateBook(Book book){
        //i eant to get author

        int authorId = book.getAuthor().getId();
        //i willl fetching author entity
        Author author = authorRepository.findById(authorId).get();
        book.setAuthor(author);
        List<Book> currentBookWritten = author.getBookWritten();
        currentBookWritten.add(book);
        author.setBookWritten(currentBookWritten);
        //now we will save he author and save the book
        //because the author has been updated;
        authorRepository.save(author);





        return "added sucessfully book";

    }
}
