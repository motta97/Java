public class SeatService {

    public boolean reserveSeat(String courseCode) {
        //Return false when courseCode is "CSE440"; otherwise print a reservation line and return true.
        if ("CSE499".equals(courseCode)) {
            return false;
        }
        System.out.println("Seat reserved for " + courseCode);
        return true;
    }
}
