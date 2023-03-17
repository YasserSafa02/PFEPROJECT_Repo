package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class StudentMapper {
    public StudentEntity convertToEntity(StudentDto d){
        StudentEntity entity=new StudentEntity();
        entity.setName(d.getName());
        entity.setId(d.getId());
        return entity;


    }
    StudentDto convertToDto(StudentEntity e ){
       StudentDto dto=new StudentDto();
       dto.setName(e.getName());
       dto.setId(e.getId());
       return dto;
    }
    List<StudentEntity>convertToEntities(List<StudentDto>dtos){
         return dtos.stream().map(dto->convertToEntity(dto)).collect(Collectors.toList());
    }
    public List<StudentDto>convertToDtos(List<StudentEntity> entities){

        return entities.stream().map(entity->convertToDto(entity)).collect(Collectors.toList());



    }
}
