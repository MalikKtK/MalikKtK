package com.example.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

public class ArmyRepository {
   private final List<String> soldiers = new ArrayList<>();

    public ArmyRepository() {
        soldiers.add("Claus");
        soldiers.add("Peter");
        soldiers.add("Pia");
        soldiers.add("Karen");
    }

    public List<String> getAll(){
        return soldiers;
    }
}
