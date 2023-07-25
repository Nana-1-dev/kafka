package net.supermarches.repository;

import net.supermarches.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository <Employe,Long>{
}
