package com.xworkz.xworkzAdminDetails.repository;

import com.xworkz.xworkzAdminDetails.dto.XworkzDto;
import com.xworkz.xworkzAdminDetails.entity.XworkzEntity;
import com.xworkz.xworkzAdminDetails.service.XworkzService;

public interface XworkzRepo {
    boolean save(XworkzEntity xworkzEntity);
}
