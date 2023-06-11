public class ElectricPokemon extends Pokemon {
    private int battery;

    public ElectricPokemon(String name, int hp, int xp, String sound, String food, int battery) {
        super(name, xp, hp, sound, food);
        this.battery = battery;
    }

    public int chargeBattery(ElectricPokemon electricPokemon) {
        System.out.println(electricPokemon + " is charging power.");
        return battery += 10;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
