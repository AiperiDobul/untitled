public class Doctor extends Rescuer{
    public Doctor(String fio, String uniform){
        super(fio, uniform);

    }

    @Override
    public void introduce(){
        System.out.println("I am Doctor");
    }
    public void treatPatient(){
        System.out.println("I am treating patient");
    }
    public void treatPatient(String message){
        System.out.println("I am treating patient");
    }
    public void treatPatient(int message){
        System.out.println("I am treating patient");
    }
    public void treatPatient(String message, String message2){
        System.out.println("I am treating patient");
    }


}
