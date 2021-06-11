package edu.schooling.repositories;

import edu.schooling.domain.Bed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BedRepository extends JpaRepository<Bed,Long> {
}
