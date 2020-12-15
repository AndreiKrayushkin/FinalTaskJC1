package by.andrei.homework.finalTask.controller.command.impl;

import by.andrei.homework.finalTask.controller.command.Command;
import by.andrei.homework.finalTask.entity.Appliance;
import by.andrei.homework.finalTask.service.ApplianceService;
import by.andrei.homework.finalTask.service.ServiceException;
import by.andrei.homework.finalTask.service.ServiceProvider;

public class FindProductCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {
        ServiceProvider provider = ServiceProvider.getInstance();
        ApplianceService applianceService = provider.getApplianceService();
        Appliance product = applianceService.findProduct(request);
        String productRepresentation = product.toString();
        
        if (!productRepresentation.isEmpty()) {
        	return productRepresentation;
        } else {
        	return "Товар не найден.";
        }
    }
}
