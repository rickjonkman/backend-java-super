public class ElectricPokemon extends Pokemon {
    private int battery;

//    CONSTRUCTOR ELECTRIC POKEMON
    public ElectricPokemon(String name, int hp, int xp, String sound, String food, int battery) {
        super(name, xp, hp, sound, food);
        this.battery = battery;
    }

//    OVERRIDE METHODS VAN DE SUPER CLASS
    @Override
    public void toEat() {
        System.out.println(electricPokemon + " is eating " + getFood());
    }

    @Override
    public String sound() {
        return getSound();
    }

//    GETTERS & SETTERS ELECTRIC POKEMON
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
