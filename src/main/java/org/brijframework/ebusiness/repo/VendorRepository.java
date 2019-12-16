package org.brijframework.ebusiness.repo;

import org.brijframework.ebusiness.modal.vendor.EOVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VendorRepository extends JpaRepository<EOVendor, Long>{

}
