public class IphoneX extends Apple{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public IphoneX(String model, int countOfCamers, int memory) {
        super(model, countOfCamers);
        this.memory = memory;
    }

   public void print(){
        System.out.println(getInfo() + "\nMemory " + memory);
    }
}
