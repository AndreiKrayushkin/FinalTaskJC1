package by.andrei.homework.finalTask.main;

import by.andrei.homework.finalTask.controller.Controller;
import by.andrei.homework.finalTask.service.ServiceException;
import by.andrei.homework.finalTask.view.View;

public class Main {

    public static void main(String[] args) throws ServiceException {
		String command;
		String response;
		Controller controller = new Controller();

		command = "login login=andrei password=4242";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct VacuumCleaner MOTOR_SPEED_REGULATION=3000";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();
		
		command = "findProduct Speaker CORD_LENGTH=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct Laptop BATTERY_CAPACITY=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

    }
}
