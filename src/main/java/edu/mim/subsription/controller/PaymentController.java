package edu.mim.subsription.controller;

import edu.mim.subsription.model.Company;
import edu.mim.subsription.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class PaymentController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public Company addCompany(@RequestBody Company company){
        return companyService.save(company);
    }

    @GetMapping("/{id}")
    public Company findCompanyById(@PathVariable Long id){
        return companyService.findById(id);
    }

    @GetMapping
    public List<Company> getCompanies(){
        return companyService.findAll();
    }

}
