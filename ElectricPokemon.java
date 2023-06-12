public class ElectricPokemon extends Pokemon {
    private int battery;
    private boolean batteryFull;

//    CONSTRUCTOR ELECTRIC POKEMON
    public ElectricPokemon(String name, int hp, int xp, String sound, String food, int battery) {
        super(name, xp, hp, sound, food);
        this.battery = battery;
    }

//    OVERRIDE METHODS VAN DE SUPER CLASS
    @Override
    public void toEat() {
        System.out.println(this.getName() + " is eating " + this.getFood());
    }

    @Override
    public String sound() {
        return getSound();
    }

    public void isBatteryFull() {
        if (battery == 100) {
            System.out.println("The battery is fully charged!");
        } else {
            System.out.println("The battery is for " + battery + "% charged.");
        }
    }

//    GETTERS & SETTERS ELECTRIC POKEMON
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
