package org.brijframework.ebusiness.repo;

import java.util.Optional;

import org.brijframework.ebusiness.modal.EOUserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserLoginRepository  extends JpaRepository<EOUserLogin, Long>{

	@Query("select u from EOUserLogin u where u.username = :username")
	Optional<EOUserLogin> findUserName(@Param("username")String username);

}
