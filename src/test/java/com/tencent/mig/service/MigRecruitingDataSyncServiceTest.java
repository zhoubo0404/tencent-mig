package com.tencent.mig.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiajia on 2018/7/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MigRecruitingDataSyncServiceTest {

    @Autowired
    private MigRecruitingDataSyncService migRecruitingDataSyncService;

    @Transactional
    @Test
    public void sync() throws Exception {
        migRecruitingDataSyncService.sync();
    }

    @Test
    public void importData() {
    }

}