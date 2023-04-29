package am.hitech.jdbc.service;

import am.hitech.jdbc.model.User;
import am.hitech.jdbc.repo.UserRepo;
import am.hitech.jdbc.util.exceptionMessage.ErrorMessage;
import am.hitech.jdbc.util.exceptions.InternalServerError;
import am.hitech.jdbc.util.exceptions.NotFoundException;

import java.util.List;

public class UserService {
    UserRepo userRepo = new UserRepo();

    public void updateUser(String firstName, String lastName, int id) throws InternalServerError{
        int row = userRepo.updateUser(firstName,lastName,id);

        if (row == 0) {
            throw new InternalServerError(ErrorMessage.ANOTHER_ERROR_MESSAGE);
        }
    }

    public void createUser(User user) throws InternalServerError{
        int row = userRepo.createUser(user);

        if (row == 0) {
            throw new InternalServerError(ErrorMessage.ANOTHER_ERROR_MESSAGE);
        }
    }

    public void createUser2(User user) throws InternalServerError{
        int row = userRepo.createUser2(user);

        if (row == 0) {
            throw new InternalServerError(ErrorMessage.ANOTHER_ERROR_MESSAGE);
        }
    }

    public void createUserV2(User user) throws InternalServerError{
        int row = userRepo.createUserV2(user);

        if (row == 0) {
            throw new InternalServerError(ErrorMessage.ANOTHER_ERROR_MESSAGE);
        }
    }

    public void deleteUser(int id) throws InternalServerError {
        int row = userRepo.deleteUser(id);

        if (row == 0) {
            throw new InternalServerError(ErrorMessage.ANOTHER_ERROR_MESSAGE);
        }
    }

    public User getByUser(String userName) throws NotFoundException {

        if (userRepo.getByUser(userName) == null) {
            throw new NotFoundException(ErrorMessage.NOT_FOUND_USER);
        }
        return userRepo.getByUser(userName);
    }

    public User getById(int id) throws NotFoundException{
        if (userRepo.getById(id) == null) {
            throw new NotFoundException(ErrorMessage.NOT_FOUND_USER);
        }
        return userRepo.getById(id);
    }

    public List<User> getByUserMoreAgeThenGiven(int age) throws NotFoundException{
        if (userRepo.getByUserMoreAgeThenGiven(age) == null) {
            throw new NotFoundException(ErrorMessage.NOT_FOUND_USER);
        }
        return userRepo.getByUserMoreAgeThenGiven(age);
    }

    public List<User> getByUser2(String s) throws NotFoundException{
        List<User> list = userRepo.getByUser2(s);
        if (list.isEmpty()) {
            throw new NotFoundException(ErrorMessage.NOT_FOUND_USER);
        }
        return userRepo.getByUser2(s);
    }

}
