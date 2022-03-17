package FourthDay.T3.business.abstracts;

import FourthDay.T2.entity.Customer;
import FourthDay.T3.entities.concretes.Campaign;
import FourthDay.T3.entities.concretes.Game;

public interface SalesService {
    void sell(Customer customer, Game game, Campaign campaign);
}
