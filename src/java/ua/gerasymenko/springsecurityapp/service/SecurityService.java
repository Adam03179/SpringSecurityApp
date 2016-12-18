package ua.gerasymenko.springsecurityapp.service;

public interface SecurityService {

    String findLoggedInUser();

    void autoLogin(String username, String password);
}
