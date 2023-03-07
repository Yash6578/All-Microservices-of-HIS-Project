package com.ashokit.datacollection.service;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenIncome;

public interface IncomeService {
    SaveResponse save(CitizenIncome income);
    CitizenIncome getById(Long id);
}
