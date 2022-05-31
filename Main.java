package Core;

public class Main {
    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("Anna", 10),
                new TeamMember("Maxim", 12),
                new TeamMember("Anton", 6),
                new TeamMember("Marina" ,3));

        Course course = new Course( new Fight(6),new Swim(10));
        course.doIt(dreamTeam);

    }
}
