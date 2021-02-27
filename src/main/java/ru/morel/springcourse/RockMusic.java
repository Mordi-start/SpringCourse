package ru.morel.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> rockList = new ArrayList<>();

    @Override
    public List<String> getSong() {
        rockList.add("Eskimo Callboys");
        rockList.add("Asking Alexandria");
        rockList.add("Stigmata");
        return rockList;
    }
}
