package com.example.demo;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.domain.User;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

/**
 * Created by 陆小凤 on 2017/7/21.
 */
public class asd {
    public static void main(String[] args){
        EntityWrapper ew = new EntityWrapper();
      /*  ew.setEntity(new User());*/
        String name="wang";
        Integer id=1;
   /*     ew.where("username = {0}",name).andNew("id = {0}",id).orderBy("id");*/
    /*    ew.where("name={0}", "'zhangsan'").and("id=1")
                .orNew("status={0}", "0").or("status=1")
                .notLike("nlike", "notvalue")
                .andNew("new=xx").like("hhh", "ddd")
                .andNew("pwd=11").isNotNull("n1,n2").isNull("n3")
                .groupBy("x1").groupBy("x2,x3")
                .having("x1=11").having("x3=433")
                .orderBy("dd").orderBy("d1,d2");*/
        System.out.println(ew.getSqlSegment());
    }
}
