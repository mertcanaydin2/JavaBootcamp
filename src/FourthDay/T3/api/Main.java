package FourthDay.T3.api;

import FourthDay.T2.Concrete.CustomerCheckManager;
import FourthDay.T3.business.abstracts.CampaignService;
import FourthDay.T3.business.abstracts.CustomerService;
import FourthDay.T3.business.abstracts.GameService;
import FourthDay.T3.business.abstracts.SalesService;
import FourthDay.T3.business.concretes.CampaignManager;
import FourthDay.T3.business.concretes.CustomerManager;
import FourthDay.T3.business.concretes.GameManager;
import FourthDay.T3.business.concretes.SalesManager;
import FourthDay.T3.entities.concretes.Campaign;
import FourthDay.T3.entities.concretes.Customer;
import FourthDay.T3.entities.concretes.Game;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1,"Mertcan","Aydın","12345","1998");
        Game game = new Game(1,"Metin2",20);
        Campaign campaign = new Campaign(1," bilemedim.",10);
        GameService gameService = new GameManager();
        CampaignService campaignService = new CampaignManager();
        SalesService salesService = new SalesManager();
        CustomerService customerService = new CustomerManager(new CustomerCheckManager());
        customerService.add(customer);
        gameService.add(game);
        campaignService.add(campaign);
        salesService.sell(customer,game,campaign);

    }
}
