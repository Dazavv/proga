package lab3.enums;

public enum Mood {
    JOYFULLY("весело"),
    SADLY("грустно");
    private String title;
    Mood(String title){
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
