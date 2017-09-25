public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing milky = new Thing("Get milk");
        fleet.add(milky);
        milky.setStatus(false);

        Thing obstacles = new Thing("Remove the obstacles");
        fleet.add(obstacles);
        obstacles.setStatus(false);

        Thing standUp = new Thing("Stand up");
        fleet.add(standUp);
        standUp.setStatus(true);

        Thing eat = new Thing("Eat lunch");
        fleet.add(eat);
        eat.setStatus(true);



        System.out.println(fleet.toString());
    }
}
