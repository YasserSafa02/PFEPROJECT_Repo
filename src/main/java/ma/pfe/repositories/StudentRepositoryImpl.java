package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @Override
    public Long save(StudentEntity e) {
        LOGGER.debug("start method save");
        return null;
    }

    @Override
    public Boolean update(StudentEntity e) {
        LOGGER.debug("start method update");
        return null;
    }

    @Override
    public Boolean deleteId(Long id) {
        LOGGER.debug("start method delete");
        return null;
    }

    @Override
    public List<StudentEntity> selectALL() {
        LOGGER.debug("start method select");
        return null;
    }
}
