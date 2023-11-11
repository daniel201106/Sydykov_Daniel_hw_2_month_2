public class Apple implements Printable{
    private String model;
    private int countOfCamers;

    public String getModel() {
        return model;
    }

    public int getCountOfCamers() {
        return countOfCamers;
    }

    public Apple(String model, int countOfCamers) {
        this.model = model;
        this.countOfCamers = countOfCamers;
    }

    public String getInfo(){
        return "Model " + model + "\nCount of camers " + countOfCamers;
    }

    @Override
    public void print() {

    }
}
