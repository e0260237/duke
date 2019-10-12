import java.io.IOException;

public class SaveCommand extends Command {

    public SaveCommand() {
        super();
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        ui.saveNow(storage, tasks.getTaskList());
    }
}
