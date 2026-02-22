package project.mobilele.service.impl;

import org.springframework.stereotype.Service;
import project.mobilele.model.UserRegistrationDTO;
import project.mobilele.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        // TODO
        System.out.println("The user received is: " + userRegistrationDTO);
    }
}
