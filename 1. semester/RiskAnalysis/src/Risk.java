public class Risk {

    private int pro;
    private int con;
    private int sev;
    private String level;

    public void setPro (int pro) {
        this.pro = pro;
    }
    void setCon (int con) {
        this.con = con;
    }
    void setSev (int sev) {
        this.sev = sev;
    }
    void setLevel (String level) {
        this.level = level;
    }

    int getPro() {
        return pro;
    }
    int getCon() {
        return con;
    }
    int getSev() {
        return sev;
    }
    String getLevel() {
        return level;
    }
}