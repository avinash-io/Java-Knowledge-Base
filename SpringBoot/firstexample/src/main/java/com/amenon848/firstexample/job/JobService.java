package com.amenon848.firstexample.job;

import java.util.List;


public interface JobService {

    List<Job> findAll();
    void createJob(Job job);

    Job findJobById(Long id);

    Boolean deleteJobById(Long id);

    boolean updateJobById(Long id, Job job);
}
