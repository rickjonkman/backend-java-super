public abstract class Pokemon {
    private String name;
    private int hp;
    private int xp;
    private String sound;
    private String food;


//      SUPER CONSTRUCTOR
    public Pokemon(String name, int hp, int xp, String sound, String food) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.sound = sound;
        this.food = food;
    }

//      ABSTRACT METHODS POKEMON
    abstract void toEat();

    abstract String sound();

//      GETTERS & SETTERS VOOR DE PRIVATE VARIABELEN IN DE SUPER CLASS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int plusHp) {
        this.hp += plusHp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
