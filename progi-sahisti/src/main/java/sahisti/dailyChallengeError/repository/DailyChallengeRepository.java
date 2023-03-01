package sahisti.dailyChallengeError.repository;

import sahisti.entity.DailyChallengeError;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyChallengeErrorRepository extends JpaRepository<DailyChallengeError, Long> {

    List<DailyChallengeError> findAllByChecked(Boolean checked);

    Boolean existsDailyChallengeErrorByDailyChallengeIdAndValid(Long dailyChallengeId, Boolean valid);

    DailyChallengeError findDailyChallengeErrorByDailyChallengeIdAndValid(Long dailyChallengeId, Boolean valid);
}
