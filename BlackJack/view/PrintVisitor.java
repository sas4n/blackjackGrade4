package BlackJack.view;

import BlackJack.model.rules.*;
import BlackJack.model.rules.hitStrategy.BasicHitStrategy;
import BlackJack.model.rules.hitStrategy.Soft17RuleStrategy;
import BlackJack.model.rules.newGameStartegy.AmericanNewGameStrategy;
import BlackJack.model.rules.newGameStartegy.InternationalNewGameStrategy;
import BlackJack.model.rules.winnerStrategy.DealerWinStrategy;
import BlackJack.model.rules.winnerStrategy.PlayerWinStrategy;

public class PrintVisitor implements IVisitor {
    @Override
    public void visit(AmericanNewGameStrategy americanNewGameStrategy) {
        System.out.println("This game use American rule");
    }

    @Override
    public void visit(Soft17RuleStrategy Soft17RuleStrategy) {
        System.out.println("This game use soft 17 rule");
    }

    @Override
    public void visit(PlayerWinStrategy PlayerWinStrategy) {
        System.out.println("This game use player win rule when player and dealer score are equal");
    }

    @Override
    public void visit(InternationalNewGameStrategy internationalNewGameStrategy) {
        System.out.println("This game use international rule");

    }

    @Override
    public void visit(BasicHitStrategy basicHitStrategy) {
        System.out.println("This game use basic hit rule");

    }

    @Override
    public void visit(DealerWinStrategy DealerWinStrategy) {
        System.out.println("This game use dealer win rule when player and dealer score are equal");

    }
}
