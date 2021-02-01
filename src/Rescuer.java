public abstract class Rescuer {
    private String fio;
    private String uniform;

    public Rescuer(){

    }

    public Rescuer(String fio, String uniform) {
        this.fio = fio;
        this.uniform = uniform;
    }
    public void introduce(){
    System.out.println("I am rescuer");
    }
    public void safeLive(){
        System.out.println("I am saving Lives!");
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    @Override
    public String toString() {
        return "Rescuer{" +
                "fio='" + fio + '\'' +
                ", uniform='" + uniform + '\'' +
                '}';
    }
}
