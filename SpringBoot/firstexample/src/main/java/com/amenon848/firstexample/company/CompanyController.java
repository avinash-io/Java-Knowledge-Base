package com.amenon848.firstexample.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        return new ResponseEntity<List<Company>>(companyService.getAllCompanies(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable Long id) {
        Company company = companyService.getCompanyById(id);
        if(company != null) {
            return new ResponseEntity<Company>(company, HttpStatus.OK);
        } else {
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company){
        return new ResponseEntity<Company>(companyService.createCompany(company), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompanyById(@RequestBody Company updatecompany,@PathVariable long id){
        return companyService.updateCompanyById(updatecompany, id)?
             new ResponseEntity<String>("Company with id "+id+" Updated for", HttpStatus.OK):
             new ResponseEntity<String>("Company with id "+id+" Not Updated for", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanyById(@PathVariable long id){
        return companyService.deleteCompanyById(id)?
                new ResponseEntity<String>("Company with id "+id+" Deleted", HttpStatus.OK):
                new ResponseEntity<String>("Company with id "+id+" Not Deleted", HttpStatus.NOT_FOUND);
    }

}
