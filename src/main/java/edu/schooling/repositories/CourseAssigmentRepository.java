package edu.schooling.repositories;

import edu.schooling.domain.CourseAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseAssigmentRepository extends JpaRepository<CourseAssignment, Long> {

}
