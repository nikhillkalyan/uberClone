package uber.uber.services;


import uber.uber.dto.DriverDto;
import uber.uber.dto.SignupDto;
import uber.uber.dto.UserDto;

public interface AuthService {

    String login(String email, String password); // returns a token string

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId); // takes a user ID and returns a DriverDto for the newly onboarded driver
}