package ru.morel.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> classicalList = new ArrayList<>();

    @Override
    public List<String> getSong() {
        classicalList.add("Bah");
        classicalList.add("Mozart");
        classicalList.add("Vivaldi");
        return classicalList;
    }
}
