public class FirePokemon extends Pokemon {
    private int gasoline;

    public FirePokemon(String name, int hp, int xp, String sound, String food, int gasoline) {
        super(name, xp, hp, sound, food);
        this.gasoline = gasoline;
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }
}
