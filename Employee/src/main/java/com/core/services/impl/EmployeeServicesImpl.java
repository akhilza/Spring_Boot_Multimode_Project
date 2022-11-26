package com.core.services.impl;

import com.core.entity.Employee;
import com.core.repo.EmplRepo;
import com.core.services.EmployeeServices;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImpl implements EmployeeServices {


   private EmplRepo emplRepo;

    public EmployeeServicesImpl(EmplRepo emplRepo) {
        this.emplRepo = emplRepo;
    }


    @Override
    public String emplCreate(Employee employee) {
        emplRepo.save(employee);
        return "Data Successfully Save";
    }
}
