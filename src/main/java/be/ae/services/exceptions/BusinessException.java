package be.ae.services.exceptions;

public class BusinessException extends ServiceException {
    public BusinessException(ErrorCode errorCode) {
        super(errorCode);
    }
}
