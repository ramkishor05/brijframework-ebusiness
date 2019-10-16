package org.brijframework.ebusiness.repo;

import org.brijframework.ebusiness.modal.EOUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRoleRepository  extends JpaRepository<EOUserRole, Long>{

	EOUserRole findByRoleName(String role);
	
	EOUserRole findByPosition(int position);

}
