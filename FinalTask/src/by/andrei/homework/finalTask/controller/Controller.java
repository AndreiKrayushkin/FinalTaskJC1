package by.andrei.homework.finalTask.controller;

import by.andrei.homework.finalTask.controller.command.Command;
import by.andrei.homework.finalTask.controller.command.CommandProvider;
import by.andrei.homework.finalTask.service.ServiceException;

public class Controller {

    private static final String WHITESPACES = "\\s+";

    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) throws ServiceException {
        String commandName = request.split(WHITESPACES, 2)[0];
        Command command = provider.takeCommand(commandName);
        return command.execute(request);
    }
}
