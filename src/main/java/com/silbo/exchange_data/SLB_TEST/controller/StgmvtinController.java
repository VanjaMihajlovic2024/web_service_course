package com.silbo.exchange_data.SLB_TEST.controller;

import com.silbo.exchange_data.SLB_TEST.entity.Stgmvtin;
import com.silbo.exchange_data.SLB_TEST.service.StgmvtinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StgmvtinController {

    @Autowired
    private StgmvtinService stgmvtinService;

    @PostMapping("/insertStgmvtin")
    public Stgmvtin postData(@RequestBody Stgmvtin stgmvtin) {

        return stgmvtinService.saveData(stgmvtin);
    }
}
