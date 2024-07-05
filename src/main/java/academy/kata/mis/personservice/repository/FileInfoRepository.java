package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {
}
