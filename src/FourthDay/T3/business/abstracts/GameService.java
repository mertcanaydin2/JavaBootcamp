package FourthDay.T3.business.abstracts;

import FourthDay.T3.entities.concretes.Game;

public interface GameService {

    void add(Game game);
    void update(Game game);
    void remove(Game game);

}
