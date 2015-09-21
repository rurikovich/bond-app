package org.bondapp.services;

import org.bondapp.domain.Bond;
import org.bondapp.domain.BondDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by rurik on 21.09.2015.
 */

@Service
public class BondService {
    public static final int REPAYMENT_TIME = 10 * 60 * 60 * 1000;

    private HashMap<String, Bond> bonds = new HashMap<>();

    {
        long currentTimeMillis = System.currentTimeMillis();
        bonds.put("111", new Bond("111", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
        bonds.put("112", new Bond("112", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
        bonds.put("113", new Bond("113", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
        bonds.put("114", new Bond("114", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
        bonds.put("115", new Bond("115", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
        bonds.put("116", new Bond("116", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
        bonds.put("117", new Bond("117", "issuer", currentTimeMillis, currentTimeMillis + REPAYMENT_TIME));
    }

    public Bond findBondByIsin(String isin) {
        return bonds.get(isin);
    }

}
