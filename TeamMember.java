package Core;


public class TeamMember {
    private String name;
    private int power;
    private Status status=Status.NoPassedDistance;

    public TeamMember (String name,int power){
        this.name=name;
        this.power=power;

    }
    public  Status getStatus(){
        return status;
    }
    public String getName (){
        return name;
    }
    public void fight (int courseDifficulty){
        if(checkPower(courseDifficulty)){
            changeStatus (Status.PassedDistance, "Won the Fight");
        }else {
            changeStatus (Status.NoPassedDistance, "Failed the Fight");
        }

    }
    public void swim (int courseDifficulty){
        if(checkPower(courseDifficulty)){
            changeStatus (Status.PassedDistance, "Won the Distance");
        }else {
            changeStatus (Status.NoPassedDistance, "Failed the Distance");
        }
    }
    private boolean checkPower (int courseDifficulty){
        return power>courseDifficulty||power==courseDifficulty;
    }
    private void changeStatus(Status newStatus, String message){
        status=newStatus;
        System.out.println(name+message);
    }
}
