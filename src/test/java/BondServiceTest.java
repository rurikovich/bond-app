import org.bondapp.Application;
import org.bondapp.domain.Bond;
import org.bondapp.services.BondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by rurik on 21.09.15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class BondServiceTest {

    @Autowired
    BondService bondService;

    @Test
    public void simpleBondServiceTest() {
        Bond bond = bondService.findBondByIsin("111");
        assertNotNull(bond);
    }

}
