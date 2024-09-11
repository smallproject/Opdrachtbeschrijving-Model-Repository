package nl.smallproject.www.techiteasy.repositories;

import nl.smallproject.www.techiteasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelevisionsRepository extends JpaRepository<Television, Long> {
}
