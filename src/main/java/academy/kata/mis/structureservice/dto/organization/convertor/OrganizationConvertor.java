package academy.kata.mis.structureservice.dto.organization.convertor;

import academy.kata.mis.structureservice.dto.organization.OrganizationDto;
import academy.kata.mis.structureservice.model.Organization;
import org.springframework.stereotype.Component;

@Component
public class OrganizationConvertor {

    public OrganizationDto entityToOrganizationDto(Organization entity) {
        return OrganizationDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
