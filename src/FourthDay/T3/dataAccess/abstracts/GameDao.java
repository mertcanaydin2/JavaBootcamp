package FourthDay.T3.dataAccess.abstracts;

import FourthDay.T3.entities.concretes.Game;

import java.util.ArrayList;
import java.util.List;

public class GameDao {
    List<Game> games;

    public GameDao(){
        games = new ArrayList<Game>();
    }

    public void add(Game game){
        games.add(game);
    }

    public void update(Game game){

    }
    public void remove(Game game){
        games.remove(game);
    }

    public List<Game> getAll(){
        return games;
    }
}
