package academy.kata.mis.repository_test.model.dto.sample;

import academy.kata.mis.repository_test.model.dto.service.MedicalServiceConverter;
import academy.kata.mis.repository_test.model.dto.service.MedicalServiceShortDto;
import academy.kata.mis.repository_test.model.entity.MedicalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class DiseaseSampleConverter {

    private final MedicalServiceConverter medicalServiceConverter;

    public DiseaseSampleDto servicesDepIdToDiseaseSampleDto(Set<Long> medicalServiceDepIdSet, Map<Long, MedicalService> medicalServiceWithServiceDepIdMap) {
        List<MedicalServiceShortDto> medicalServiceShortDtoList = new ArrayList<>();
        for(Long medicalServiceDepId: medicalServiceDepIdSet) {
            medicalServiceShortDtoList.add(medicalServiceConverter.serviceDepIdToMedicalServiceShortDto(medicalServiceDepId, medicalServiceWithServiceDepIdMap));
        }
        return new DiseaseSampleDto(medicalServiceShortDtoList);
    }

}
