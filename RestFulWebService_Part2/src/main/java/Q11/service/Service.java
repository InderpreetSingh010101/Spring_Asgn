package Q11.service;

import Q11.DTO.UserDTO;
import Q11.User;

import java.util.List;

public interface Service {
     List<User> getAllUsersData() ;


    User getSingleUsersData(int id);

    User postUser(UserDTO userBody);
}
