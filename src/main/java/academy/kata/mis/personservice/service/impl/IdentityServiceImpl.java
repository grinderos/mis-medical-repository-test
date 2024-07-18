package academy.kata.mis.personservice.service.impl;

import academy.kata.mis.personservice.model.IdentityDocument;
import academy.kata.mis.personservice.repository.IdentityRepository;
import academy.kata.mis.personservice.service.IdentityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class IdentityServiceImpl implements IdentityService {
    private final IdentityRepository identityRepository;

    @Override
    public Set<IdentityDocument> getIdentityDocumentsByPersonId(Long personId) {
        return identityRepository.getIdentityDocumentsByPersonId(personId);
    }

    @Override
    public IdentityDocument getIdentityDocumentByPersonId(Long personId){
        return identityRepository.getIdentityDocumentByPersonId(personId);
    }
}
