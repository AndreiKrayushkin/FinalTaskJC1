package by.andrei.homework.finalTask.controller.command;

import by.andrei.homework.finalTask.service.ServiceException;

public interface Command {
	String execute(String request) throws ServiceException;
}
