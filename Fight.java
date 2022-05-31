package Core;

public class Fight extends Obstacle {
    public Fight (int difficulty){
        super(difficulty);
    }
    public void goChallenge(TeamMember member){
        member.fight(super.getDifficulty());
    }
}
