package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class HousingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> shelterLocations;
    List<String> descriptions;
    List<String> websites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);
        getSupportActionBar().setTitle("Wally");
        recyclerView = findViewById(R.id.recyclerview);
        shelterLocations = new ArrayList<>();
        descriptions = new ArrayList<>();
        websites = new ArrayList<>();
        recyclerAdapter = new RecyclerAdapter(shelterLocations, websites, descriptions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

        shelterLocations.add("The Family Giving Tree");
        shelterLocations.add("HomeFirst Services");
        shelterLocations.add("Helping Hand For Relief");
        shelterLocations.add("West Valley Community Services");
        shelterLocations.add("Family Supportive Housing");
        shelterLocations.add("Second Harvest of Silicon Valley");
        shelterLocations.add("Pivotal");
        shelterLocations.add("YMCA");
        shelterLocations.add("American Red Cross");
        shelterLocations.add("United Way Bay Area");
        shelterLocations.add("WeHOPE");
        shelterLocations.add("Project Happiness");
        shelterLocations.add("Move Up Nonprofit");
        shelterLocations.add("Habitat for Humanity");
        shelterLocations.add("Abode Services");
        shelterLocations.add("Bay Area Rescue Mission");
        shelterLocations.add("Cityteam");
        shelterLocations.add("Coalition on Homelessness");
        shelterLocations.add("Inatalent");
        shelterLocations.add("Stand Up For Kids");

        descriptions.add("The Family Giving Tree is an organization located primarily in Milpitas and is aimed at providing children in the Bay Area with equal educational opportunities.");
        descriptions.add("HomeFirst aspires to help individuals in Santa Clara who are facing homelessness. They have over 40 years of experience and are welcoming.");
        descriptions.add("Centers located in Santa Clara, Helping Hand for Relief serves humanity by providing those with need with vital resources.");
        descriptions.add("West Valley Community Services is located in Cupertino and is dedicated towards providing individuals with help in terms of food, housing, mobile, and educational support.");
        descriptions.add("Family Supportive Housing is a Homeless Shelter in San Jose and has been acknowledged for its caring staff and services.");
        descriptions.add("Second Harvest of Silicon Valley has wonderful facilities and focuses on providing food for all.");
        descriptions.add("Pivotal aspires to provide all with support in achieving a strong education such that they are well prepared for jobs.");
        descriptions.add("YMCA in the Silicon Valley provides all with recreational programs and other services.");
        descriptions.add("American Red Cross is in San Jose and provides everyone with support.");
        descriptions.add("United Way Bay Area has been known to help people in achieving stability during difficult times.");
        descriptions.add("WeHOPE provides shelter help.");
        descriptions.add("Focuses on empowering others.");
        descriptions.add("Empowers women to start businesses and find jobs.");
        descriptions.add("Supports individuals in terms of housing.");
        descriptions.add("Working towards ending homelessness");
        descriptions.add("Bay Area Rescue Mission works to help individuals get back on their feet and find shelter");
        descriptions.add("Focuses on providing individuals with shelter");
        descriptions.add("Works toward reducing homelessness throughout the Bay Area");
        descriptions.add("Aspires to help individuals find job opportunities by helping them learn and gain new skill sets.");
        descriptions.add("Aims to provide assistance to children and parents who are in need of support.");

        websites.add("https://familygivingtree.org");
        websites.add("https://www.homefirstscc.org");
        websites.add("https://new.hhrd.org");
        websites.add("https://www.wvcommunityservices.org");
        websites.add("http://www.familysupportivehousing.org");
        websites.add("https://www.shfb.org");
        websites.add("https://www.pivotalnow.org");
        websites.add("https://www.ymcasv.org");
        websites.add("https://www.redcross.org/local/california/northern-california-coastal/about-us/locations/silicon-valley.html?CID=organic_gmb_listings");
        websites.add("https://www.google.com/maps/dir//United+Way+Bay+Area,+1400+Parkmoor+Ave,+San+Jose,+CA+95126/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x808fcb73209c38d1:0x71350affc03f7017?sa=X&ved=2ahUKEwii_rmdrcXxAhXTop4KHTvEBOMQ48ADMAB6BAgBEBQ");
        websites.add("https://www.wehope.org");
        websites.add("https://projecthappiness.org");
        websites.add("moveuptoday.org");
        websites.add("https://www.habitat.org");
        websites.add("http://abodeservices.org");
        websites.add("http://bayarearescue.org");
        websites.add("http://cityteam.org");
        websites.add("http://cohsf.org");
        websites.add("https://www.inatalent.org");
        websites.add("https://www.homelessassistance.us/li/standup-for-kids-silicon-valley");


    }

}
