package com.xotoboil.springboilerplate.mockitodemo.business;

public class SomeBusinessImplementation {
    private DataService dataService;

    public SomeBusinessImplementation(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retriveAllData();

        int greatestValue = data[0];
        for (int i = 1; i<data.length; i++) {
            if (data[i] > greatestValue) greatestValue = data[i];
        }
        return greatestValue;
    }
}

interface DataService {
    int[] retriveAllData();
}