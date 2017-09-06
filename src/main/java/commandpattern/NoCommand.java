package commandpattern;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command was set!");
    }
}
