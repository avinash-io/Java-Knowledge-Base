package com.amenon848.firstexample.company;

import com.amenon848.firstexample.job.Job;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    boolean updateCompanyById(Company updatecompany, long id);


    Company createCompany(Company updatecompany);

    boolean deleteCompanyById(long id);

    Company getCompanyById(Long id);
}
