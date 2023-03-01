package sahisti.dailyChallengeError.service;

import sahisti.entity.DailyChallengeError;

import java.util.List;

public interface DailyChallengeErrorService {

    DailyChallengeError createNewTicket(Long userId, Long dcId, String solution, String description);

    List<DailyChallengeError> getAllUnchecked();

    DailyChallengeError validateError(Long dceId, Boolean validation) throws Exception;
}

