package FourthDay.T3.business.concretes;

import FourthDay.T2.entity.Customer;
import FourthDay.T3.business.abstracts.SalesService;
import FourthDay.T3.entities.concretes.Campaign;
import FourthDay.T3.entities.concretes.Game;

public class SalesManager implements SalesService {
    @Override
    public void sell(Customer customer, Game game, Campaign campaign) {
        System.out.println(game.getName() + " Selled to "+customer.getFirstName() + " "+customer.getLastName()+ " with "+campaign.getDiscountRate() + " % discount with "+campaign.getCampaignName());
    }
}
