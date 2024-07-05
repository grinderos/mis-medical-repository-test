package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.License;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseRepository extends JpaRepository<License, Long> {
}
