package rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
