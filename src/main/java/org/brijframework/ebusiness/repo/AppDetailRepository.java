package org.brijframework.ebusiness.repo;

import org.brijframework.ebusiness.modal.apps.EOAppDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AppDetailRepository  extends JpaRepository<EOAppDetail, Long>{

}
