package codingdojo.pokerhands.winning;

import codingdojo.pokerhands.Player;

public class ThreeOfAKindDeterminater extends Determinater {

  @Override
  protected Player getWinner(Player p1, Player p2) {
    if(p1.hasThreeOfAKind()&&p2.hasThreeOfAKind()){
      if(p1.getThreeOfAKind().compareTo(p2.getThreeOfAKind()) > 0){
        return p1;
      }
      if(p2.getThreeOfAKind().compareTo(p1.getThreeOfAKind()) > 0){
        return p2;
      }
    }

    if (p1.hasThreeOfAKind() && !p2.hasThreeOfAKind()) {
      return p1;
    }

    if (p2.hasThreeOfAKind() && !p1.hasThreeOfAKind()) {
      return p2;
    }
    return null;
  }
}
