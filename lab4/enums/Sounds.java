package lab4.enums;

public enum Sounds {
    MOOING("мычащий"),
    WHINING("скулящий");
    private String title;
    Sounds(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toString(){
        return title;
    }
}
