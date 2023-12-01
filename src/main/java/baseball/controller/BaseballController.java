package baseball.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void Game(){
        outputView.printStartMessage();
        getUserNumber();
    }

    private void getUserNumber(){
        inputView.askNumber();
        String userNumber = readLine();
    }





}
