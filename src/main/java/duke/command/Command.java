package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public abstract class Command {
    protected boolean terminated;

    public Command() {
        this.terminated = false;
    }

    public boolean isTerminated() {
        return this.terminated;
    }

    public abstract void execCommand(TaskList list, Ui ui, Storage storage);
}