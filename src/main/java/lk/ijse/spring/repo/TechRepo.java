package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Tech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechRepo extends JpaRepository<Tech,String> {
}
