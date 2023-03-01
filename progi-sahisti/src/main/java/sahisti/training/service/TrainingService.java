package sahisti.training.service;

import sahisti.tournament.entity.Tournament;
import sahisti.training.entity.Training;
import sahisti.user.entity.User;

import java.util.List;

public interface TrainingService{

    List<Training> findAllRelevant();

    List<Training> findAllByUserId(Long id);

    Training addTraining(Training training);

    User addMember(Long id, Long memberId);

    Training removeTraining(Long id);

    List<Training> findAllByCoachId(Long id);
}
