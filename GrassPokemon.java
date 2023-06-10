public class GrassPokemon extends Pokemon {
    private int poison;

    public GrassPokemon(String name, int hp, int xp, String sound, String food, int poison) {
        super(name, xp, hp, sound, food);
        this.poison = poison;
    }
}
