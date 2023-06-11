class FirePokemon extends Pokemon {
    private int gasoline;

//      CONSTRUCTOR FIRE POKEMON
    public FirePokemon(String name, int hp, int xp, String sound, String food, int gasoline) {
        super(name, xp, hp, sound, food);
        this.gasoline = gasoline;
    }

//      OVERRIDE METHODS VAN DE SUPER CLASS

    @Override
    public void toEat() {
        System.out.println(firePokemon + " is eating " + getFood());
        setHp(10);
    }

    @Override
    public String sound() {
        return getSound();
    }

    //      GETTER & SETTER GASOLINE FIRE POKEMON
    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }
}
