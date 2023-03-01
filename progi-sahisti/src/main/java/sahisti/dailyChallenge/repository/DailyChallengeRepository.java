package sahisti.dailyChallenge.repository;

import sahisti.dailyChallenge.entity.DailyChallenge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface DailyChallengeRepository extends JpaRepository<DailyChallenge, Long> {
    public DailyChallenge findByDateAndVisible(LocalDate date, Boolean visible);
}

