package Q10.service;

import Q10.DTO.UserDTO;
import Q10.User;
import Q10.UserV2;

import java.util.List;

public interface Service {
     List<User> getAllUsersData() ;


    List<UserV2> getAllUsersDataV2();

    User postUser(UserDTO userBody);
    UserV2 postUserV2(UserV2 userBody);
}
