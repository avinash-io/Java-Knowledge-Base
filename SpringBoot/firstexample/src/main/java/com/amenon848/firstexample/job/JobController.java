package com.amenon848.firstexample.job;

import com.amenon848.firstexample.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> findAll() {
        return new ResponseEntity(jobService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> findById(@PathVariable Long id) {
        Job job = jobService.findJobById(id);
        if(job!= null){
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<String> createJobs(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("Job Added Sucessfully!", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        boolean deletestatus = jobService.deleteJobById(id);
        if(deletestatus) {
            return ResponseEntity.ok("Sucessful deletion of Job with id: "+ id);
        }
        return new ResponseEntity<>("Id either not found or cannot be delted!!", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateById(@PathVariable Long id, @RequestBody Job job) {
        boolean updatestatus = jobService.updateJobById(id, job);
        if(updatestatus) {
            return ResponseEntity.ok("Sucessful updation of Job with id: "+ id);
        }
        return new ResponseEntity<>("Id either not found or cannot be updated!!", HttpStatus.NOT_FOUND);
    }
}
