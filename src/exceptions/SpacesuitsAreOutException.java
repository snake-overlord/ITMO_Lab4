package exceptions;

import java.io.IOException;

public class SpacesuitsAreOutException extends IOException {
    public SpacesuitsAreOutException(String message){
        super(message);
    }
}
