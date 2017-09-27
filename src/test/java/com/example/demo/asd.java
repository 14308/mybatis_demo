package com.example.demo;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.easycodebox.common.log.slf4j.Logger;
import com.easycodebox.common.log.slf4j.LoggerFactory;
import com.example.demo.domain.Department;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 陆小凤 on 2017/7/21.
 */


public class asd {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ParseException {
        Date date = new Date();
        String a = "asdasdasd";
       /* String eL = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
        Pattern p = Pattern.compile(eL);
        Matcher m = p.matcher(s);
        boolean dateFlag = m.matches();
        if (!dateFlag) {
            System.out.println("格式错误");
        }*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

       System.out.println(a.length());
    }
}

