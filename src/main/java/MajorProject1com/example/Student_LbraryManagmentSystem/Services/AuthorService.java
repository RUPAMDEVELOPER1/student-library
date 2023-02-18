package MajorProject1com.example.Student_LbraryManagmentSystem.Services;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Author;
import MajorProject1com.example.Student_LbraryManagmentSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public String CreateAuthor(Author author){
        authorRepository.save(author);
        return "added sucessfully";
    }
}
