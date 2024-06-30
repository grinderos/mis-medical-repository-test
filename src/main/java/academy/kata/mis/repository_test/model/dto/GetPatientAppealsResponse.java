package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.appeal.AppealShortDto;

import java.util.List;

public record GetPatientAppealsResponse(List<AppealShortDto> appeals) {
}
