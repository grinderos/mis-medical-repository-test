package academy.kata.mis.repository_test.model.dto.service;

import academy.kata.mis.repository_test.model.entity.MedicalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class MedicalServiceConverter {

    public MedicalServiceShortDto serviceDepIdToMedicalServiceShortDto(Long medicalServiceDepId, Map<Long, MedicalService> medicalServiceWithServiceDepIdMap) {
        return MedicalServiceShortDto.builder()
                .medicalServiceDepId(medicalServiceDepId)
                .serviceName(medicalServiceWithServiceDepIdMap.get(medicalServiceDepId).getName())
                .serviceIdentifier(medicalServiceWithServiceDepIdMap.get(medicalServiceDepId).getIdentifier()).build();
    }
}
