package com.silbo.exchange_data.SLB_TEST.service;

import com.silbo.exchange_data.SLB_TEST.entity.Stgmvtin;
import com.silbo.exchange_data.SLB_TEST.repository.StgmvtinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StgmvtinService {

    @Autowired
    private StgmvtinRepo stgmvtinRepo;

    public StgmvtinService(StgmvtinRepo stgmvtinRepo) {
        this.stgmvtinRepo = stgmvtinRepo;
    }

    public Iterable<Stgmvtin> list() {
        return stgmvtinRepo.findAll();
    }

    public Stgmvtin save(Stgmvtin stgmvtin) {
        return stgmvtinRepo.save(stgmvtin);
    }

    public Iterable<Stgmvtin> save(List<Stgmvtin> stgmvtinList) {
        return stgmvtinRepo.saveAll(stgmvtinList);
    }

    public Stgmvtin saveData(Stgmvtin stgmvtin) {
        return stgmvtinRepo.save(stgmvtin);
    }
}
