package com.example.regionkommunev1.config;

import com.example.regionkommunev1.model.Kommune;
import com.example.regionkommunev1.model.Region;
import com.example.regionkommunev1.repository.KommuneRepository;
import com.example.regionkommunev1.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    KommuneRepository kommuneRepository;

    @Override
    public void run(String... args) throws Exception {
        Region reg = new Region();
        reg.setKode("0001");
        reg.setName("Hovedstaden");
        reg.setHref("hoved.dk");
        regionRepository.save(reg);

        Kommune kom = new Kommune();
        kom.setKode("0001");
        kom.setName("Roskilde");
        kom.setHref("roskilde.dk");

        kom.setRegion(reg);
        kommuneRepository.save(kom);

        kom = new Kommune();
        kom.setKode("0002");
        kom.setName("Roskildex");
        kom.setHref("roskildex.dk");
        kom.setRegion(reg);
        kommuneRepository.save(kom);


    }
}
