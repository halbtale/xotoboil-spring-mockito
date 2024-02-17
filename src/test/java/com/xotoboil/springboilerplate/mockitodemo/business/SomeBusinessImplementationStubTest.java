package com.xotoboil.springboilerplate.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplementationStubTest {

    @Test
    void test() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImplementation businessImplementation = new SomeBusinessImplementation(dataServiceStub);
        int result = businessImplementation.findTheGreatestFromAllData();
        int expectedResult = 25;
        assertEquals(expectedResult, result);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retriveAllData() {
        return new int[] {25, 15, 5};
    }
}