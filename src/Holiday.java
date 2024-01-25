public class Holiday {
    private String name;
    private String date;

    Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return this.name;
    }

    public String getDate(){
        return this.date;
    }
}
