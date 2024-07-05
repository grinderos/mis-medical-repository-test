package academy.kata.mis.structureservice.service.impl;

import academy.kata.mis.structureservice.model.Organization;
import academy.kata.mis.structureservice.repository.OrganizationRepository;
import academy.kata.mis.structureservice.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationRepository organizationRepository;

    @Override
    public boolean isExistById(long organizationId) {
        return organizationRepository.existsById(organizationId);
    }

    @Override
    public Organization getOrganizationInformationById(long organizationId) {
        return organizationRepository.getReferenceById(organizationId);
    }
}
