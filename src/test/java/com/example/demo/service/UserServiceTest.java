//package com.example.demo.service;
//
//import com.example.demo.domain.User;
//import com.example.demo.mapper.UserMapper;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.ArgumentCaptor;
//import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
//
///**
// * Created by 陆小凤 on 2017/7/24.
// */
//@PrepareForTest({UserMapper.class})
//public class UserServiceTest {
//
//
//    private UserMapper userMapper;
//
//    @Before
//    public void setUp() throws Exception {
//        userMapper = PowerMockito.mock(UserMapper.class);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        Mockito.verifyNoMoreInteractions(userMapper);
//    }
//
//    @Test
//    public void ttt() throws Exception {
//        //1.准备数据
//        User user = User.builder().
//                id(11l).
//                username("dada").
//                password("123123").
//                departement_id(2l).
//                full_name("zhang").build();
//        //2.Mock 方法行为
//        ArgumentCaptor<User> argumentCaptor = ArgumentCaptor.forClass(User.class);
//        PowerMockito.when(userMapper.insert(argumentCaptor.capture())).thenReturn(1);
//        //3.方法调用
//        UserService userService = new UserService(userMapper);
//        userService.crate(user);
//        //4.verify 结果
//        assertThat(argumentCaptor.getValue().getUsername()).isEqualTo("dada");
//        Mockito.verify(userMapper,Mockito.times(1)).insert(argumentCaptor.capture());
//    }
//
//}

