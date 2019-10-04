package org.brijframework.ebusiness.repo;

import org.brijframework.ebusiness.modal.apps.EOAppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AppRoleRepository  extends JpaRepository<EOAppRole, Long>{

}
