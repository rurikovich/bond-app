package org.bondapp.services;

import org.bondapp.domain.Bond;
import org.bondapp.domain.BondDto;
import org.springframework.stereotype.Service;

/**
 * Created by rurik on 21.09.2015.
 */

@Service
public class BondService {

    private Bond[] bonds = new Bond[]{
            new Bond("111", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
            new Bond("112", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
            new Bond("113", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
            new Bond("114", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
            new Bond("115", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
            new Bond("116", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
            new Bond("117", "issuer", System.currentTimeMillis(), System.currentTimeMillis() + 1000),
    };


    public Bond findBondByIsin(String isin) {
        return bonds[0];
    }

}
