package academy.kata.mis.medicalservice.repository;

import academy.kata.mis.medicalservice.model.entity.XRay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XRayRepository extends JpaRepository<XRay, Long> {
}
