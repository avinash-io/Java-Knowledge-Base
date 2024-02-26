package com.amenon848.firstexample.job.impl;

import com.amenon848.firstexample.job.Job;
import com.amenon848.firstexample.job.JobRepository;
import com.amenon848.firstexample.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    //private List<Job> jobs = new ArrayList<Job>();
    JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    //private Long jobID = 1L;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
       // job.setId(jobID++);
        jobRepository.save(job);
    }

    @Override
    public Job findJobById(Long id) {
//        for(Job job: jobs) {
//            if(job.getId().equals(id)) {
//                return job;
//            }
//        }

       return jobRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteJobById(Long id) {
//        boolean status = false;
//        Iterator<Job> iterator = jobs.iterator();
//        while (iterator.hasNext()) {
//            Job job = iterator.next();
//            if (job.getId().equals(id)) {
//                iterator.remove(); // Safe removal
//                status = true;
//            }
//        }
//        return status;

        try{
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean updateJobById(Long id, Job newjob) {
//        boolean status = false;
//        Iterator<Job> iterator = jobs.iterator();
//        while (iterator.hasNext()) {
//            Job job = iterator.next();
//            if (job.getId().equals(id)) {
//
//                if(newjob.getTitle() != null) job.setTitle(newjob.getTitle());
//                if(newjob.getDescription() != null) job.setDescription(newjob.getDescription());
//                if(newjob.getLocation() != null) job.setLocation(newjob.getLocation());
//                if(newjob.getMinSalary() != null) job.setMinSalary(newjob.getMinSalary());
//                if(newjob.getMaxSalary() != null) job.setMaxSalary(newjob.getMaxSalary());
//
//                status = true;
//            }
//        }
//        return status;

        try {

            Optional<Job> jobOptional = jobRepository.findById(id);

            if (jobOptional.isPresent()) {
                Job job = jobOptional.get();

                if(newjob.getTitle() != null) job.setTitle(newjob.getTitle());
                if(newjob.getDescription() != null) job.setDescription(newjob.getDescription());
                if(newjob.getLocation() != null) job.setLocation(newjob.getLocation());
                if(newjob.getMinSalary() != null) job.setMinSalary(newjob.getMinSalary());
                if(newjob.getMaxSalary() != null) job.setMaxSalary(newjob.getMaxSalary());

                jobRepository.save(job);

                return true;
            }

            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }




    }
}
