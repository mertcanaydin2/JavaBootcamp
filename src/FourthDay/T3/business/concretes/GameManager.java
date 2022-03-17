package FourthDay.T3.business.concretes;

import FourthDay.T3.business.abstracts.GameService;
import FourthDay.T3.dataAccess.abstracts.GameDao;
import FourthDay.T3.entities.concretes.Game;

public class GameManager implements GameService {
    GameDao gameDao = new GameDao();
    @Override
    public void add(Game game) {
        System.out.println("Game Saved to Database : " + game.getName());
        gameDao.add(game);    }

    @Override
    public void update(Game game) {
        System.out.println("Game Updated:" + game.getName());
        gameDao.update(game);
    }

    @Override
    public void remove(Game game) {
        System.out.println("Game Removed : "+game.getName());
        gameDao.remove(game);
    }
}
