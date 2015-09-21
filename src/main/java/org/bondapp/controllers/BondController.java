package org.bondapp.controllers;

import org.bondapp.domain.Bond;
import org.bondapp.domain.BondDto;
import org.bondapp.services.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BondController {

    public static final long MILLIS_IN_DAY = 24 * 60 * 60 * 1000;

    @Autowired
    private BondService bondService;

    @RequestMapping("/bonds")
    public List<BondDto> bond(@RequestParam(value = "isins") List<String> isins) {
        List<BondDto> results = new ArrayList<>();
        for (String isin : isins) {
            results.add(new BondDto(bondService.findBondByIsin(isin), System.currentTimeMillis()));
        }
        return results;
    }

    @RequestMapping("/profitability_chart_data")
    public List<List<Double>> bond(@RequestParam(value = "isins") List<String> isins, @RequestParam(value = "startdate") long startdate, @RequestParam(value = "enddate") long enddate) {
        List<List<Double>> results = new ArrayList<>();
        for (String isin : isins) {
            List<Double> chartdata = new ArrayList<>();
            Bond bond = bondService.findBondByIsin(isin);

            for (long time = startdate; time < enddate; time += MILLIS_IN_DAY) {
                chartdata.add(bond.getProfitability(time));
            }
            results.add(chartdata);
        }
        return results;
    }

}
