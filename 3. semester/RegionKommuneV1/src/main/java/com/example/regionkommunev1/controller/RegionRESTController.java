package com.example.regionkommunev1.controller;

import com.example.regionkommunev1.service.ApiServiceGetRegioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.regionkommunev1.model.Region;

import java.util.List;

@RestController
public class RegionRESTController {

    @Autowired
    ApiServiceGetRegioner apiServiceGetRegioner;

    @GetMapping("/getregioner")
    public List<Region> getRegioner() {
        List<Region> lstRegioner = apiServiceGetRegioner.getRegioner();
        return lstRegioner;
    }


}
