public class Main {
    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject")
                , createObject("twoObject"), createObject("threeObject")};
        for (Printable printable: print) {
            printable.print();
        }

    }

    public static Printable createObject(String className){
        switch (className){
            case "oneObject":
                IphoneX iphoneX = new IphoneX("IphoneX", 2, 256);
                return iphoneX;

            case "twoObject":
                IphoneXR iphoneXR = new IphoneXR("IphoneXR", 2, 64);
                return iphoneXR;

            case "threeObject":
                Iphone11 iphone11 = new Iphone11("Iphone11", 3, 128);
                return iphone11;
        }
        return null;
    }
}