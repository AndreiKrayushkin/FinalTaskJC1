package by.andrei.homework.finalTask.controller.command.impl;

import by.andrei.homework.finalTask.controller.command.Command;
import by.andrei.homework.finalTask.service.ServiceException;
import by.andrei.homework.finalTask.service.ServiceProvider;
import by.andrei.homework.finalTask.service.UserService;

public class LoginCommand implements Command {

	private static final String WHITESPACES = "\\s+";
	private static final String EQUAL = "=";

	@Override
	public String execute(String request) throws ServiceException {
		String[] params = request.split(WHITESPACES);
		String login = params[1].split(EQUAL)[1];
		String password = params[2].split(EQUAL)[1];
		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService = provider.getUserService();
		
		boolean result = userService.login(login, password);
		if (result == true) {
			return "Авторизация произведена успешно.";
		} else {
			return "Пожалуйста, проверьте введенный логин или пароль."; 
		}
	}
}
