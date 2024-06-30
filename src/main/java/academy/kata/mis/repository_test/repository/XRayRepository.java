package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.XRay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XRayRepository extends JpaRepository<XRay, Long> {
}
