package polyclinic_main_lesson1;

public class MedicalReferralTherapist implements IMedicalReferral{
    private static final String ref = "напрвление к терапевту";

    @Override
    public String getDoctorType() {
        return ref;
    }
}
