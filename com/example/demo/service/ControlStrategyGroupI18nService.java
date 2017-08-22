package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class ControlStrategyGroupI18nService extends BaseService<ControlStrategyGroupI18nMapper,ControlStrategyGroupI18n> {
    private final ControlStrategyGroupI18nMapper controlstrategygroupi18nmapper;

    ControlStrategyGroupI18nController(ControlStrategyGroupI18nMapper controlstrategygroupi18nmapper){
        this.controlstrategygroupi18nmapper = controlstrategygroupi18nmapper;
    }
}
