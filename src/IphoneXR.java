public class IphoneXR extends Apple{

    private int memory;

    public IphoneXR(String model, int countOfCamers, int memory) {
        super(model, countOfCamers);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }
    public void print() {
        System.out.println(getInfo() + "\nMemory " + memory);
    }
}
