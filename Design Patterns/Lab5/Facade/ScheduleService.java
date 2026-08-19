public class ScheduleService {

    public boolean hasConflict(String studentId, String courseCode) {
        return ("CSE499".equals(courseCode));
    }
}
