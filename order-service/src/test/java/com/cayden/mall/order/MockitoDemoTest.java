package com.cayden.mall.order;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;


import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDemoTest {

//    //注入依赖的资源对象
//    @Mock
//    private MockitoTestService mockitoTestService;
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testVerify(){
        //创建mock
        List mockedList = mock(List.class);
        mockedList.add("1");
        mockedList.clear();
        //验证list调用过add的操作行为
        verify(mockedList).add("1");
        //验证list调用过clear的操作行为
        verify(mockedList).clear();
        //使用内建anyInt()参数匹配器，并存根
        when(mockedList.get(anyInt())).thenReturn("element");
        System.out.println(mockedList.get(2)); //此处输出为element
        verify(mockedList).get(anyInt());
    }

    @Test
    public void testStub(){
        //可以mock具体的类，而不仅仅是接口
        LinkedList mockedList = mock(LinkedList.class);
        //存根(stubbing)
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());
        //下面会打印 "first"
        System.out.println(mockedList.get(0));
        //下面会抛出运行时异常
//        System.out.println(mockedList.get(1));
        //下面会打印"null" 因为get(999)没有存根(stub)
        System.out.println(mockedList.get(999));
        doThrow(new RuntimeException()).when(mockedList).clear();
        //下面会抛出 RuntimeException:
        mockedList.clear();
    }
}
