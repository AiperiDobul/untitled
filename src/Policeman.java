public class Policeman extends Rescuer{
    public Policeman(String fio, String uniform){
        super(fio, uniform);

    }

   @Override
    public void introduce(){
        System.out.println("I am Policeman");
    }
    public void checkDocuments(){
        System.out.println("Please, introduce your documents");
    }

}
