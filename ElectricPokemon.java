public class ElectricPokemon extends Pokemon {
    private int battery;

    public ElectricPokemon(String name, int hp, int xp, String sound, String food, int battery) {
        super(name, xp, hp, sound, food);
        this.battery = battery;
    }

}
