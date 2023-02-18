package MajorProject1com.example.Student_LbraryManagmentSystem.Repository;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
