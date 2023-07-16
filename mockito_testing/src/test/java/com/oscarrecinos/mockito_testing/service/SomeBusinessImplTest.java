package com.oscarrecinos.mockito_testing.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplTest {
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;


    @Test
    void test(){
        // mock.retrieveAllData() => new int[]{1,2,3};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3,4,5});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(5, result);
    }

    @Test
    void test2(){
        // mock.retrieveAllData() => new int[]{1,2,3};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void test3(){
        // mock.retrieveAllData() => new int[]{1,2,3};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3,4,5});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(5, result);
    }
}
