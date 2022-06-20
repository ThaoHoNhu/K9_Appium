package lab_08;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;


    protected Animal (Builder builder ){
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public void setName (String name){
        this.name = name;
        }

        public void setSpeed ( int speed){
        this.speed = speed;
        }

        public void setFlyable ( boolean flyable){
        this.flyable = flyable;
        }

        public Animal build(){
            return new Animal (this);
        }
    }

}
