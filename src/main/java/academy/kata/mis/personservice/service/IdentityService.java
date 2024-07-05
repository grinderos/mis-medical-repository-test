package academy.kata.mis.personservice.service;

import academy.kata.mis.personservice.model.IdentityDocument;

import java.util.Set;

public interface IdentityService {
    Set<IdentityDocument> getIdentityDocumentsByPersonId(Long personId);
}
