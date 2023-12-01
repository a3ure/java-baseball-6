package baseball.exception;

public enum ExceptionMessages {

    NONE_INPUT("값을 입력하세요\n"),
    NULL_INPUT("값을 입력하세요\n"),
    NONE_DIGIT("정수를 입력하세요\n"),
    OUT_OF_RANGE("1~9의 수로 이루어진 세 자리 수를 입력해주세요"),
    OUT_OF_LENGTH_RANGE("3자리 수를 입력해주세요.");


    private static final String ERROR_PREFIX = "[ERROR] ";
    private final String exceptionMessage;

    ExceptionMessages(String exceptionMessage) {
        this.exceptionMessage = ERROR_PREFIX + exceptionMessage;
    }

    public String getMessages() {
        return this.exceptionMessage;
    }

    public void throwException() {
        throw new IllegalArgumentException(exceptionMessage);
    }
}
