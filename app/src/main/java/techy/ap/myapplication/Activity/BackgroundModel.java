package techy.ap.myapplication.Activity;

import android.view.View;

public class BackgroundModel {

    View[] view;
    boolean tag;

    public boolean isTag() {
        return tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }

    public View[] getView() {
        return view;
    }

    public void setView(View[] view) {
        this.view = view;
    }

}
