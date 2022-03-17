package FourthDay.T3.business.concretes;

import FourthDay.T3.business.abstracts.CampaignService;
import FourthDay.T3.dataAccess.abstracts.CampaignDao;
import FourthDay.T3.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

    CampaignDao campaignDao = new CampaignDao();
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign Inserted. (" +campaign.getCampaignName()+")");
        campaignDao.add(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign Updated. ("+campaign.getCampaignName()+")");
        campaignDao.update(campaign);
    }

    @Override
    public void remove(Campaign campaign) {
        System.out.println("Campaign Removed. (" +campaign.getCampaignName()+")");
        campaignDao.remove(campaign);

    }
}
