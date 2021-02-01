public class Fireman extends Rescuer{
    public Fireman(String fio, String uniform){
        super(fio, uniform);

    }

    @Override
    public void introduce(){
        System.out.println("I am Fireman");
    }

}
