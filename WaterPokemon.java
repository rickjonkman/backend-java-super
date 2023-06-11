public class WaterPokemon extends Pokemon {
    private int water;

    public WaterPokemon(String name, int hp, int xp, String sound, String food, int water) {
        super(name, xp, hp, sound, food);
        this.water = water;
    }

    public int drinkWater(WaterPokemon waterPokemon) {
        System.out.println(waterPokemon + " is drinking water.");
        return water += 10;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
