package by.andrei.homework.finalTask.service;

import by.andrei.homework.finalTask.entity.Appliance;

public interface ApplianceService {
	<T extends Appliance> T findProduct(String request) throws ServiceException;
	boolean addNewProduct(String request) throws ServiceException;
}
