package admin_user.service;

import admin_user.dto.UserDto;
import admin_user.model.UserEntity;

public interface UserService {
	
	UserEntity save (UserDto userDto);
	

}
