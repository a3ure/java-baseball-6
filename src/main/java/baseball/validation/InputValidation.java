package baseball.validation;

import baseball.exception.ExceptionMessages;

public class InputValidation {

    private static final int RANGE_MIN_NUMBER = 1;
    private static final int RANGE_MAX_NUMBER = 9;
    private static final int NUMBER_LENGTH = 3;

    public void validateInputNumber(String inputNumber){
        checkEmpty(inputNumber);
        checkNull(inputNumber);
        checkDigit(inputNumber);
        checkNumberLength(inputNumber);
        checkNumberRange(inputNumber);
    }

    private void checkNumberLength(String inputNumber){
        if(inputNumber.length() != NUMBER_LENGTH){
            ExceptionMessages.OUT_OF_LENGTH_RANGE.throwException();
        }
    }

    private void checkDigit(String inputNumber) {
        try {
            Integer.parseInt(inputNumber);
        }catch (NumberFormatException e){
            ExceptionMessages.NONE_DIGIT.throwException();
        }
    }

    private void checkEmpty(String inputNumber){
        if(inputNumber.isEmpty()){
            ExceptionMessages.NONE_INPUT.throwException();
        }
    }

    private void checkNull(String inputNumber){
        if(inputNumber == null){
            ExceptionMessages.NULL_INPUT.throwException();
        }
    }

    private void checkNumberRange(String inputNumber){
        if(isLessThanRange(inputNumber)||isMoreThanRange(inputNumber)){
            ExceptionMessages.OUT_OF_RANGE.throwException();
        }
    }

    private boolean isLessThanRange(String inputNumber){
        return (Integer.parseInt(inputNumber) < RANGE_MIN_NUMBER);
    }

    private boolean isMoreThanRange(String inputNumber){
        return (Integer.parseInt(inputNumber) > RANGE_MAX_NUMBER);
    }

}
