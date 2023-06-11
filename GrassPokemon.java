public class GrassPokemon extends Pokemon {
    private int poison;

//      CONSTRUCTOR GRASS POKEMON
    public GrassPokemon(String name, int hp, int xp, String sound, String food, int poison) {
        super(name, xp, hp, sound, food);
        this.poison = poison;
    }

//      OVERRIDE METHODS VAN DE SUPER CLASS
    @Override
    public void toEat() {
        System.out.println(grassPokemon + " is eating " + getFood());
        setHp(10);
}

    @Override
    public String sound() {
        return getSound();
    }

//      GETTERS & SETTERS GRASS POKEMON
    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }
}
