package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")


public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService service;
    @PostMapping
    public long save(StudentDto dto){
        LOGGER.debug("start method save");
        return service.save(dto);
    }
    @PutMapping
    public Boolean update(StudentDto dto){
        LOGGER.debug("start method update");
        return service.update(dto);
    }
    @DeleteMapping
    public Boolean delete(Long id){
        LOGGER.debug("start method delete");
        return service.deleteByiD(id);
    }
    @GetMapping
    public List<StudentDto> selectAll(){
        LOGGER.debug("start method select");
        return service.selectALL();
    }
}
