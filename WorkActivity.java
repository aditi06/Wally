package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter2 recyclerAdapter;

    List<String> workOpportunities;
    List<String> websites;
    List<String> descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        getSupportActionBar().setTitle("Wally");
        recyclerView = findViewById(R.id.recyclerview);
        workOpportunities = new ArrayList<>();
        websites = new ArrayList<>();
        descriptions = new ArrayList<>();
        recyclerAdapter = new RecyclerAdapter2(workOpportunities, websites, descriptions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        workOpportunities.add("Customer Service Attendant I - City of Cupertino");
        workOpportunities.add("Sales Engineer at Edmund Optics ");
        workOpportunities.add("Trader Joe’s Crew Member");
        workOpportunities.add("Dietary Assistant in Cupertino ");
        workOpportunities.add("AOI Tech");
        workOpportunities.add("Data and Software Engineer");
        workOpportunities.add("Retail Store Associate at CVS Health ");
        workOpportunities.add("Chipotle Restaurant Team Member");
        workOpportunities.add("Wireless Associate, Retail Sales");
        workOpportunities.add("Whole Foods Market Specialty Team Member");
        workOpportunities.add("Clinic Specialist");
        workOpportunities.add("Tech Support");
        workOpportunities.add("Advertisement Tech Lead at Walmart ");
        workOpportunities.add("Customer Service Associate");
        websites.add("https://www.governmentjobs.com/careers/Cupertino/jobs/3121524/customer-service-attendant-i/apply?pagetype=jobOpportunitiesJobs ");
        websites.add("https://www.job-u.com/job/sales-engineer-in-cupertino-california/6699-1226074833D1?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic ");
        websites.add("https://traderjoes.avature.net/careers/JobDetail/United-States-Crew/8845?source=Indeed.com");
        websites.add("https://us.fidanto.com/jobs/job-opening/healthcare-support-workers-all-other/dietary-assistant-dishwasher-308728349?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://directlyapply.com/jobs/modis/60daea11fc095320da4b62f0?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://www.linkedin.com/jobs/view/data-test-engineer-at-dice-2631610999");
        websites.add("https://www.linkedin.com/jobs/view/retail-store-associate-at-cvs-health-2603993408?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://jobs.chipotle.com/job/cupertino/restaurant-team-member-crew-211-cupertino-b2/282/9341601936?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://uscareers-oslrs.icims.com/jobs/31016/wireless-associate---retail-sales--tg3224/login?utm_source=google_jobs_apply&utm_medium=organic&utm_campaign=google_jobs_apply");
        websites.add("https://careers.wholefoodsmarket.com/global/en/job/WHFOGLOBALREQ20210609052/search-results?keywords&utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://www.resume-library.com/job/view/40084471/sales-clinical-specialist?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://www.linkedin.com/jobs/view/desktop-tech-support-at-eteam-2568896209?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        websites.add("https://directlyapply.com/?utm_campaign=expired_google_jobs_apply&utm_source=60d210bff4891abccbb94623");
        websites.add("https://jobs.walgreens.com/job/cupertino/customer-service-associate-temporary/1242/5181550048?utm_campaign=google_jobs_apply&utm_source=google_jobs_apply&utm_medium=organic");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");
        descriptions.add("Job Opportunity. Click to Apply Now!");


    }
}
