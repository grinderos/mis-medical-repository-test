package academy.kata.mis.personservice.dto.contact;

import academy.kata.mis.personservice.enums.ContactType;
import lombok.Builder;

@Builder
public record ContactToReportServiceDTO(Long id,
                                        ContactType contactType,
                                        String value) {
}
