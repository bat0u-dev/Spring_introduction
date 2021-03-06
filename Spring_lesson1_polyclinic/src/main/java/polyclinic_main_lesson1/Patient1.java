package polyclinic_main_lesson1;

public class Patient1 implements IPatient{
    IMedicalReferral referral;

    public void setReferral(IMedicalReferral referral) {
        this.referral = referral;
    }

    @Override
    public void goToPolyclinic() {
        System.out.println("Пациент1 идет в поликлинику");
    }

    @Override
    public void getMedicalCard() {
        System.out.println(referral.getDoctorType());
    }
}
