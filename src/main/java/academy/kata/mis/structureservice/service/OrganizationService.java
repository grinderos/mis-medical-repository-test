package academy.kata.mis.structureservice.service;

import academy.kata.mis.structureservice.model.Organization;

public interface OrganizationService {
    boolean isExistById(long organizationId);
    Organization getOrganizationInformationById(long organizationId);
}
