public class WaterPokemon extends Pokemon {
    private int water;

//    CONSTRUCTOR WATER POKEMON
    public WaterPokemon(String name, int hp, int xp, String sound, String food, int water) {
        super(name, xp, hp, sound, food);
        this.water = water;
    }

//      OVERRIDE METHODS VAN DE SUPER CLASS
    @Override
    public void toEat() {
        System.out.println(waterPokemon + " is eating " + getFood());
    }

    @Override
    public String sound() {
        return getSound();
    }

//    GETTERS & SETTERS WATER POKEMON
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
