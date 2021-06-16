package edu.schooling.services;

import edu.schooling.domain.Student;
import edu.schooling.domain.dto.StudentDto;

import java.util.List;

public interface StudentService {

    public Student save(StudentDto dto);
    public List<Student> getAll();

}
