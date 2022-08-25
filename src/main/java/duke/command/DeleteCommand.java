package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

public class DeleteCommand extends Command {
    private int num;

    public DeleteCommand(int num) {
        super();
        this.num = num;
    }

    @Override
    public void execCommand(TaskList list, Ui ui, Storage storage) {
        Task removed = list.removeTask(this.num);
        ui.showDelete(removed, list.getSize());
        storage.saveList(list.save());
    }
}