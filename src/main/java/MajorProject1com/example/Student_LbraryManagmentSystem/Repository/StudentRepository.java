package MajorProject1com.example.Student_LbraryManagmentSystem.Repository;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
