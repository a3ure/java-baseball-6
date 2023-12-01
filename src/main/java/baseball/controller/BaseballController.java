package baseball.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

import baseball.util.RandomNumberGenerator;
import baseball.validation.InputValidation;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballController {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    InputValidation inputValidation = new InputValidation();
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public void Game(){
        outputView.printStartMessage();
        getUserNumber();
        List<Integer> computerNumbers = getRandomNumbers();
    }

    private void getUserNumber(){
        inputView.askNumber();
        String userNumber = readLine();
        try{
            inputValidation.validateInputNumber(userNumber);
        }catch (IllegalArgumentException e){
            getUserNumber();
        }
    }

    private List<Integer> getRandomNumbers(){
        return randomNumberGenerator.generateRandomNumbers();
    }

}
