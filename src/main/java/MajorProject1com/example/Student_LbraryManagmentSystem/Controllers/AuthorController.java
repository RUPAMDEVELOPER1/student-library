package MajorProject1com.example.Student_LbraryManagmentSystem.Controllers;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Author;
import MajorProject1com.example.Student_LbraryManagmentSystem.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping
    public String addAuthor(@RequestBody Author author){
        return authorService.CreateAuthor(author);
    }


}
