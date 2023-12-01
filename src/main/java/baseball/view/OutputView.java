package baseball.view;

public class OutputView {
    private static final String STARTING_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String BALL ="볼";
    private static final String STRIKE ="스트라이크";
    private static final String NOTHING ="낫싱";
    private static final String ENDING_MESSAGE = "%d개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void printStartMessage(){
        System.out.println(STARTING_MESSAGE);
    }
}
