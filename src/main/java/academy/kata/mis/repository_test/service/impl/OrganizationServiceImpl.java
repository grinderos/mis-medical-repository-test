package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.repository.OrganizationRepository;
import academy.kata.mis.repository_test.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public Long getOrganizationIdByDepartmentId(Long departmentId) {
        return organizationRepository.getOrganizationIdByDepartmentId(departmentId);
    }

    @Override
    public long getOrganizationIdByDoctorId(long id) {
        return organizationRepository.getOrganizationIdByDoctorId(id);
    }
}
