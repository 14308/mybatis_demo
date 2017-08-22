package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class JournalHeadersService extends BaseService<JournalHeadersMapper,JournalHeaders> {
    private final JournalHeadersMapper journalheadersmapper;

    JournalHeadersController(JournalHeadersMapper journalheadersmapper){
        this.journalheadersmapper = journalheadersmapper;
    }
}
