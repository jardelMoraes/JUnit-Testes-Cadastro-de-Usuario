package Repository;

import Entitie.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    public void create_creatingElementSizeWillIncreaseOneUnit(){
        UserRepository userRepository = new UserRepository();
        int AtualSize = UserRepository.userList.size();
        User user = new User();
        user.setId(userRepository.idcont());
        user.setName("Jardel");
        user.setAge(25);
        user.setEmail("jardel@email.com");
        userRepository.create(user);
        Assertions.assertEquals(AtualSize + 1, UserRepository.userList.size());
    }

    @Test
    void read_createdListEqualReturnedListMethod() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        user.setId(userRepository.idcont());
        user.setName("Jardel");
        user.setAge(25);
        user.setEmail("jardel@email.com");
        userRepository.create(user);
        var listTest= UserRepository.userList;
        Assertions.assertEquals(listTest,userRepository.read());
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }


}