package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenIncome;
import com.ashokit.datacollection.repository.CitizenIncomeRepo;
import com.ashokit.datacollection.service.IncomeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IncomeServiceImpl implements IncomeService {
    final CitizenIncomeRepo incomeRepo;

    @Override
    public SaveResponse save(CitizenIncome income) {
        Long incomeId = incomeRepo.save(income).getIncomeId();

        if(incomeId != 0)
            return new SaveResponse("Income details saved with id " + incomeId, "Success");
        return new SaveResponse("Income details not saved", "Failed");
    }

    @Override
    public CitizenIncome getById(Long id) {
        return incomeRepo.findById(id).orElse(null);
    }
}
