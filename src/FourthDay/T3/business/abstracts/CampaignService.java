package FourthDay.T3.business.abstracts;

import FourthDay.T3.entities.concretes.Campaign;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void remove(Campaign campaign);
}
