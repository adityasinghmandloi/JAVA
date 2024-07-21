interface Doctor {
    void accept_appointments();
    void reject_appointments();
    void view_patients();
    void prescribe();    
}

interface Patient {
    void book_appointment();
    void cancel_appointment();
    void view_records();
    void view_doctors();
}

interface Healthcare {
    void view_records();
    void view_patients();
}

class Admin implements Doctor, Patient, Healthcare {
    public void accept_appointments() {
        System.out.println("Admin accepting appointments");
    }

    public void reject_appointments() {
        System.out.println("Admin rejecting appointments");
    }

    public void view_patients() {
        System.out.println("Admin viewing patients");
    }

    public void prescribe() {
        System.out.println("Admin prescribing");
    }

    public void book_appointment() {
        System.out.println("Admin booking appointment");
    }

    public void cancel_appointment() {
        System.out.println("Admin canceling appointment");
    }

    public void view_records() {
        System.out.println("Admin viewing records");
    }

    public void view_doctors() {
        System.out.println("Admin viewing doctors");
    }
}

class HealthcareSystem extends Admin {
    @Override
    public void accept_appointments() {
        super.accept_appointments();
        System.out.println("HealthcareSystem: Appointment accepted");
    }

    @Override
    public void reject_appointments() {
        super.reject_appointments();
        System.out.println("HealthcareSystem: Appointment rejected");
    }

    @Override
    public void view_patients() {
        super.view_patients();
        System.out.println("HealthcareSystem: Viewing patients");
    }

    @Override
    public void prescribe() {
        super.prescribe();
        System.out.println("HealthcareSystem: Prescribing medicine");
    }

    @Override
    public void book_appointment() {
        super.book_appointment();
        System.out.println("HealthcareSystem: Booking appointment");
    }

    @Override
    public void cancel_appointment() {
        super.cancel_appointment();
        System.out.println("HealthcareSystem: Canceling appointment");
    }

    @Override
    public void view_records() {
        super.view_records();
        System.out.println("HealthcareSystem: Viewing records");
    }

    @Override
    public void view_doctors() {
        super.view_doctors();
        System.out.println("HealthcareSystem: Viewing doctors");
    }
}

public class Ehealth {
    public static void main(String[] args) {
        HealthcareSystem obj = new HealthcareSystem();
        obj.accept_appointments();
        obj.book_appointment();
        obj.cancel_appointment();
        obj.prescribe();
        obj.reject_appointments();
        obj.view_doctors();
        obj.view_records();
        obj.view_patients();
    }
}

