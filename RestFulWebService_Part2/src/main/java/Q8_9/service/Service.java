package Q8_9.service;

import Q8_9.DTO.UserDTO;
import Q8_9.User;

import java.util.List;

public interface Service {
     List<User> getAllUsersData() ;




    User postUser(UserDTO userBody);
}
