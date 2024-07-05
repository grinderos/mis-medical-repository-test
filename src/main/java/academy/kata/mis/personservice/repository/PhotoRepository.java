package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
