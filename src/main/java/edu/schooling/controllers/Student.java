package edu.schooling.controllers;

import edu.schooling.domain.dto.SchoolManResponseDto;
import edu.schooling.domain.dto.StudentDto;
import edu.schooling.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URISyntaxException;
@RestController
@RequestMapping("/schl_man/v1/students")
public class Student {
    private final Logger log = LoggerFactory.getLogger(Student.class);
    private final StudentService studentService;
    public Student(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/addStudent")
    public ResponseEntity<SchoolManResponseDto> createStudent(@Valid @RequestBody StudentDto studentDto)
            throws URISyntaxException {
        log.info("REST request to save studentDto : {}", studentDto);
        StudentDto std = null;
        try {
            std = new StudentDto(studentService.save(studentDto));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest()
                    .body(new SchoolManResponseDto(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null));
        }
        return ResponseEntity.ok()
                .body(new SchoolManResponseDto(HttpStatus.OK, "SUCCESSFULLY RECORDED", std));
    }
}