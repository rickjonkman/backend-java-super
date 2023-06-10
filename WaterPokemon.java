public class WaterPokemon extends Pokemon {
    private int water;

    public WaterPokemon(String name, int hp, int xp, String sound, String food, int water) {
        super(name, xp, hp, sound, food);
        this.water = water;
    }
}
