package com.xotoboil.springboilerplate.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplementationMockTest {
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImplementation businessImplementation;

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {25, 15, 5});
        int result = businessImplementation.findTheGreatestFromAllData();
        int expectedResult = 25;
        assertEquals(expectedResult, result);
    }
}