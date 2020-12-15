package by.andrei.homework.finalTask.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.andrei.homework.finalTask.controller.command.impl.FindProductCommand;
import by.andrei.homework.finalTask.controller.command.impl.LoginCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("login", new LoginCommand());
		commands.put("findProduct", new FindProductCommand());
	}
	
	public Command takeCommand(String commandName) {
		return commands.get(commandName);
	}
}
