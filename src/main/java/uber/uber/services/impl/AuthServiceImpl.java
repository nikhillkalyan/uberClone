package uber.uber.services.impl;

import org.springframework.stereotype.Service;
import uber.uber.dto.DriverDto;
import uber.uber.dto.SignupDto;
import uber.uber.dto.UserDto;
import uber.uber.services.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
