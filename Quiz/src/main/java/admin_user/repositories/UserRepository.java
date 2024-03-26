package admin_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin_user.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
	UserEntity findByEmail (String email);
}
