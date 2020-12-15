package by.andrei.homework.finalTask.service.impl;

import by.andrei.homework.finalTask.dao.DaoException;
import by.andrei.homework.finalTask.dao.DaoProvider;
import by.andrei.homework.finalTask.dao.UserDao;
import by.andrei.homework.finalTask.service.ServiceException;
import by.andrei.homework.finalTask.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String login, String password) throws ServiceException {
        boolean result;
        if (login == null || password == null || login.length() < 4 || password.length() < 5) {
            result = false;
        } else {
            DaoProvider provider = DaoProvider.getInstance();
            UserDao userDao = provider.getUserDao();
            try {
                result = userDao.authorization(login, password);
            } catch (DaoException e) {
                throw new ServiceException(e);
            }
        }
        return result;
    }
}
