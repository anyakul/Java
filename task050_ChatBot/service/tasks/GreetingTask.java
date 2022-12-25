package task050_ChatBot.service.tasks;

public class GreetingTask extends Task{
    public GreetingTask(String text, Task next) {
        super(text, next);
    }

    @Override
    public String completeTask(String input) {
        return null;
    }
}
