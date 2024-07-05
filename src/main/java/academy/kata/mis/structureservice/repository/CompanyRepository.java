package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
