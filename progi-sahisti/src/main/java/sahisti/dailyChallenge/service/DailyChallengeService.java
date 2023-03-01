package sahisti.dailyChallenge.service;

import com.github.bhlangonijr.chesslib.Board;
import sahisti.dailyChallenge.controller.dto.BoardDTO;
import sahisti.dailyChallenge.entity.DailyChallenge;

import java.util.List;

public interface DailyChallengeService {
    Boolean startGame(Long id, String move, Boolean bonus) throws Exception;

    DailyChallenge addDailyChallenge(int assignmentNumber, Long id);

    DailyChallenge removeDailyChallenge(Long id);

    BoardDTO showBoard() throws Exception;

    List<BoardDTO> getAll() throws Exception;

    Float giveGrade(Float grade);

    Float getGrade();
}
