package lab3.enums;

public enum Time {
    AT_THIS_TIME ("В это время"),
    INSTANTLY ("Мигом");
    private String title;
    Time(String title){
        this.title = title;
    }

    public void getTitle() {
        this.title = title;
        System.out.println(title);
    }
    @Override
    public String toString(){
        return title;
    }
}
