package kulkarni.aditya.famchs;

/**
 * Created by adicool on 19/4/17.
 */

public class Purchase {

    private String mTitle;
    private String mDescription;
    private int mImage;
    private String mNumber;

    public Purchase(String mTitle, String mDescription, int mImage,String mNumber) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mImage = mImage;
        this.mNumber = mNumber;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
