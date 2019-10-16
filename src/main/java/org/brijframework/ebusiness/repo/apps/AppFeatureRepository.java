package org.brijframework.ebusiness.repo.apps;

import org.brijframework.ebusiness.modal.apps.EOAppFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AppFeatureRepository  extends JpaRepository<EOAppFeature, Long>{

}
