package BlackJack.model.rules.newGameStartegy;

import BlackJack.model.rules.IVisitor;

public class InternationalNewGameStrategy extends Factory {

  //in case of tie winner would be player


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}