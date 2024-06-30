package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.appeal.AppealShortInfoDto;

import java.util.List;

public record GetPatientAppealShortInfoResponse(List<AppealShortInfoDto> appeals) {
}
