package NewFeaturesInJava8.lambda;

public class MainLambda {
    public static void fire(Object sender) {
        System.out.println("Fire!!!");

    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Пожар";
//        message = "Fire";
        switcher.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.print(message);
                System.out.println("!!!");
            }
        });


        switcher.addElectricityListener(sender -> System.out.print("Fire!!!"));
        switcher.addElectricityListener(MainLambda::fire);

        switcher.switchOn();
    }
}
