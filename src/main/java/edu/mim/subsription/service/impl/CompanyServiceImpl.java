package edu.mim.subsription.service.impl;

import edu.mim.subsription.model.Company;
import edu.mim.subsription.repository.CompanyRepository;
import edu.mim.subsription.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService  {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company findById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public void delete(Company company) {
        companyRepository.delete(company);
    }

    @Override
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}
