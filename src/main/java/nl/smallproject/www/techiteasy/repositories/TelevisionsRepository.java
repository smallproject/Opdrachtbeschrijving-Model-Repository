package nl.smallproject.www.techiteasy.repositories;

import nl.smallproject.www.techiteasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelevisionsRepository extends JpaRepository<Television, Long> {
    List<Television> findByBrand(String brand);
}
