package commands;

import exceptions.SpacesuitsAreOutException;

public interface CommandThrowsException {
    void execute() throws SpacesuitsAreOutException;
}
