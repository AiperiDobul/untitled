public class Main {
    public static void main(String[] args) {
        Policeman policeman = new Policeman("Colombo", "Blue");
        Fireman fireman = new Fireman("Fireman", "Red");
        Doctor doctor = new Doctor("House", "Whire");
//        policeman.introduce();
//        fireman.introduce();
//        doctor.introduce();
        Rescuer rescuer = new Policeman("Jake", "Blue");
        Rescuer rescuer1 = new Fireman("Fireman2", "Red");
        Rescuer rescuer2 = new Doctor("House2", "White");
//        rescuer.introduce();
//        rescuer1.introduce();
//        rescuer2.introduce();
        Rescuer[] rescuers = new Rescuer[6];
        rescuers[0] = policeman;
        rescuers[1] = fireman;
        rescuers[2] = doctor;
        rescuers[3] = rescuer;
        rescuers[4] = rescuer1;
        rescuers[5] = rescuer2;
        for(Rescuer r : rescuers){
            r.introduce();
        }
//        Object object = new Rescuer();

    }
}
