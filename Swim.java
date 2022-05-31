package Core;

public class Swim extends Obstacle{
    public Swim (int difficulty){
        super(difficulty);
    }
    public void goChallenge(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}
