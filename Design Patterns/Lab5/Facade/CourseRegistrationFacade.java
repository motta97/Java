public class CourseRegistrationFacade{
    RegistrationResult registrationResult;
    EligibilityService eligibilityService;
    ScheduleService scheduleService;
    SeatService seatService;
    EnrollmentRepository enrollmentRepository;
    NotificationService notificationService;
    public CourseRegistrationFacade(){
            eligibilityService = new EligibilityService();
            registrationResult = new RegistrationResult();
            scheduleService = new ScheduleService();
            seatService= new SeatService();
            enrollmentRepository = new EnrollmentRepository();
            notificationService = new NotificationService();
    }
    public RegistrationResult registerCourse(String studentId, String courseCode){

            if(!eligibilityService.isEligible(studentId, courseCode)){
                registrationResult.setSuccess(false);
                registrationResult.setMessage("Student is not eligible for course registration");
                return registrationResult;
            }

            if(scheduleService.hasConflict(studentId, courseCode)){
                registrationResult.setSuccess(false);
                registrationResult.setMessage("Student has conflict in his schedule");
                return registrationResult;
            }
            
            if(!seatService.reserveSeat(courseCode)){
                registrationResult.setSuccess(false);
                registrationResult.setMessage("No available seats in that course");
                return registrationResult;
            }
            
            enrollmentRepository.save(studentId, courseCode);
            
            notificationService.sendConfirmation(studentId, courseCode);
            registrationResult.setSuccess(true);
            registrationResult.setMessage("Registration Successful");
            return registrationResult;


    }
}