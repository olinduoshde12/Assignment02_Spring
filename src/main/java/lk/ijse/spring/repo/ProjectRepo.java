package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,String> {
}
