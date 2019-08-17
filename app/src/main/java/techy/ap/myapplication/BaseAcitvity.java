package techy.ap.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class BaseAcitvity extends AppCompatActivity {

    CustCheckChange change;

    private ArrayList<View> list;
    private OnClickListener onClickListener;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        change = new custom(this);

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void customBackground(View... view) {

        change.checkChange(view);
    }

}
