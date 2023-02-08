package lab4.enums;

public enum Direction {
    BACK("обратно"),
    DIRECT("прямо");
    private String title;
    Direction(String title){
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
