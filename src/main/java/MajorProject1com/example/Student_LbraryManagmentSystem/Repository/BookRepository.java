package MajorProject1com.example.Student_LbraryManagmentSystem.Repository;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
