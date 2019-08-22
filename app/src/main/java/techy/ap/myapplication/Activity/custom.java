package techy.ap.myapplication.Activity;

import android.content.Context;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

import techy.ap.myapplication.R;

public class custom extends AppCompatActivity implements CustCheckChange
{

    private ArrayList<View> list;
    private View.OnClickListener onClickListener;
    Context context;

    public custom(Context context) {
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void checkChange(View... view) {

        list = new ArrayList<View>();
        BackgroundModel model = new BackgroundModel();

        for (View v : view)
        {
            list.add(v);
            v.setTag(false);
            Button button = (Button) v;
            button.setBackground(context.getDrawable(R.drawable.gray_box));
            v.setOnClickListener(new CustClicklistener(list));
        }

    }


    public class CustClicklistener implements View.OnClickListener {


        ArrayList<View> list;

        public CustClicklistener(ArrayList<View> list) {
            this.list = list;
        }

        private static final String TAG = "CustClicklistener";

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onClick(View v) {

            Button button = (Button) v;

            Context context = v.getContext();

            int id = button.getId();

            for (int i = 0; i < list.size(); i++) {

                View view = list.get(i);
                if (id == view.getId())
                {
                    boolean enabled = (boolean) button.getTag();
                    if (enabled)
                    {
                        button.setBackground(context.getDrawable(R.drawable.gray_box));
//                        button.setTag(false);
                        list.get(i).setTag(false);
                    }
                    else
                    {
                        button.setBackground(context.getDrawable(R.drawable.red_box));
//                        button.setTag(true);
                        list.get(i).setTag(true);
                    }
                }
                else
                {
                    list.get(i).setTag(false);
                    Button button1 = (Button) view;
//                    button1.setTag(false);
                    button1.setBackground(context.getDrawable(R.drawable.gray_box));
                }

            }

            Log.d(TAG, "onClick: listener " + button.getText().toString());
        }
    }

}