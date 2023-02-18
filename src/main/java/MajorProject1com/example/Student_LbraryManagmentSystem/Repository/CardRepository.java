package MajorProject1com.example.Student_LbraryManagmentSystem.Repository;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
