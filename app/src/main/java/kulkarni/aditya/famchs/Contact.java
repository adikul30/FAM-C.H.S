package kulkarni.aditya.famchs;

/**
 * Created by adicool on 19/4/17.
 */

public class Contact {

    String mName;
    String mOccupation;
    String mNumber;

    public Contact(String mOccupation, String mName, String mNumber) {
        this.mOccupation = mOccupation;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmOccupation() {
        return mOccupation;
    }

    public void setmOccupation(String mOccupation) {
        this.mOccupation = mOccupation;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
