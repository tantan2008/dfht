package df.admin.service.imp;

import df.admin.mapper.userMapper;
import df.admin.model.user;
import df.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private userMapper  userMapper;
    public List<user> findAll(){
        return  userMapper.selectAll();
    }

}
