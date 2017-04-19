package kulkarni.aditya.famchs;

/**
 * Created by adicool on 19/4/17.
 */

public class Events {
    private String mtitle;
    private String mdescription;

    public Events(String mtitle, String mdescription) {
        this.mtitle = mtitle;
        this.mdescription = mdescription;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }
}
