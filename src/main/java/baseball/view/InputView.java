package baseball.view;

public class InputView {
    private static final String ASK_USER_NUMBER = "숫자를 입력해주세요 : ";
    private static final String ASK_NEW_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void askNumber(){
        System.out.print(ASK_USER_NUMBER);
    }
}
