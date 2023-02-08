package lab4.enums;

public enum State {
    POOR("бедный"),
    HAPPY("счастливый");
    private String title;
    State(String title){
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
