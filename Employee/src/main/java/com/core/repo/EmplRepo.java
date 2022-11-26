package com.core.repo;

import com.core.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplRepo extends JpaRepository<Employee, Long> {
}
