package FourthDay.T3.dataAccess.abstracts;

import FourthDay.T3.entities.concretes.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignDao {
    List<Campaign> campaigns;

    public CampaignDao(){
        campaigns = new ArrayList<Campaign>();

    }

    public void add(Campaign campaign){
        campaigns.add(campaign);

    }

    public void update(Campaign campaign){

    }

    public void remove(Campaign campaign){
        campaigns.remove(campaign);
    }

    public List<Campaign> getAll(){
        return campaigns;
    }
}
