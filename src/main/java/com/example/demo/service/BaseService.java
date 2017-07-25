package com.example.demo.service;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * Created by markfredchen on 15/05/2017.
 */
abstract public class BaseService<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

    public Wrapper<T> getBaseWrapper() {
        return new EntityWrapper<T>()
                .eq("is_deleted", false)
                .eq("is_enabled", true);
    }

}