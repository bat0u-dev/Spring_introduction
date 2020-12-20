package polyclinic_main_lesson1;

public class MedicalReferralENT implements IMedicalReferral{
    private static final String ref = "направление к ЛОР'у";

    @Override
    public String getDoctorType() {
        return ref;
    }
}
