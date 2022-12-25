package task050_ChatBot.service;

import task050_ChatBot.service.tasks.GreetingTask;
import task050_ChatBot.service.tasks.LoginTask;
import task050_ChatBot.service.tasks.PasswordTask;
import task050_ChatBot.service.tasks.Task;

import java.util.Iterator;

public class TasksService implements Iterable<Task> {
    private final GreetingTask greetingTask;

    public TasksService() {
        Task passwordTask = new PasswordTask("Введите пароль", null);
        Task loginTask = new LoginTask("Введите логин", passwordTask);
        greetingTask = new GreetingTask("Привествую в чатботе для регистрации", loginTask);
    }

    @Override
    public Iterator<Task> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Task next() {
                return greetingTask;
            }
        };
    }
}
