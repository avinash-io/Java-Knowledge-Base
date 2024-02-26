package com.amenon848.firstexample.company.impl;

import com.amenon848.firstexample.company.CompanyController;
import com.amenon848.firstexample.company.CompanyRepository;
import com.amenon848.firstexample.company.Company;
import com.amenon848.firstexample.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompanyById(Company updatecompany, long id) {

        try {

            Optional<Company> optional = companyRepository.findById(id);

            if (optional.isPresent()) {
                Company company = optional.get();
                company.setName(updatecompany.getName());
                company.setDescription(updatecompany.getDescription());
                companyRepository.save(company);
            }

            return true;

        } catch (Exception e) {

            return false;

        }

    }

    @Override
    public Company createCompany(Company updatecompany) {
        return companyRepository.save(updatecompany);
    }

    @Override
    public boolean deleteCompanyById(long id) {
        try {
            if(companyRepository.existsById(id)) {
                companyRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
