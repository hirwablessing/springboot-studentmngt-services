package edu.schooling.domain.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import edu.schooling.domain.Bed;
import edu.schooling.domain.CourseAssignment;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StudentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private Set<Bed> beds = new HashSet<Bed>();
    private Set<CourseAssignment> courses = new HashSet<>();
}
