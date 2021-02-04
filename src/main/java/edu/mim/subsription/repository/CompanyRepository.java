package edu.mim.subsription.repository;

import edu.mim.subsription.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
