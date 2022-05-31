package Core;

public class Team {
    private TeamMember[] members;
    private final String title;

    public Team (String title,TeamMember...members){
        this.title=title;
        this.members=members;
    }
    public TeamMember [] getMembers () {
        return members;
    }
    public void showResults (){
        System.out.println("the obstacle course was overcome by the team:"+ title);
        for (TeamMember member:members){
            if (member.getStatus()==Status.NoPassedDistance){
                showResultMemberNoPassed(member);
            }else{
                showResultMemberPassed (member);
            }
        }

    }
    private void showResultMemberNoPassed (TeamMember member){
        System.out.println(member.getName()+"obstacle course failed");
    }
    private void showResultMemberPassed (TeamMember member){
        System.out.println(member.getName()+ "obstacle course passed");
    }
}
