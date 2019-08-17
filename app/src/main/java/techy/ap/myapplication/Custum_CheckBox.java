package techy.ap.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class Custum_CheckBox extends BaseAcitvity {

    private static final String TAG = "Custum_CheckBox";
    private ArrayList<View> list;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_checkbox);


        final Button button = (Button) findViewById(R.id.chekc_button);
        final Button button2 = (Button) findViewById(R.id.chekc_button2);

        customBackground(button, button2);
//        button.setOnClickListener(new OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//            @Override
//            public void onClick(View v) {
//
//                Log.d(TAG, "onClick: my view");
//
//
//
//            }
//        });



    }






    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void custom(View... view)
    {
//        list = new ArrayList<View>();
//        BackgroundModel model = new BackgroundModel();
//
//
//        for (View v : view)
//        {
//            list.add(v);
//            v.setTag(false);
//            Button button = (Button) v;
//            button.setBackground(getDrawable(R.drawable.gray_box));
//            v.setOnClickListener(listener);
//        }



    }


//    OnClickListener listener = new OnClickListener() {
//        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//        @Override
//        public void onClick(View v) {
//
//            Button button = (Button) v;
//
//            int id = button.getId();
//
//            for (int i = 0; i < list.size(); i++) {
//
//                View view = list.get(i);
//
//                if (id == view.getId())
//                {
//                    boolean enabled = (boolean) button.getTag();
//                    if (enabled)
//                    {
//                        button.setBackground(getDrawable(R.drawable.gray_box));
//                        button.setTag(false);
//                        list.get(i).setTag(false);
//                    }
//                    else
//                    {
//                        button.setBackground(getDrawable(R.drawable.red_box));
//                        button.setTag(true);
//                        list.get(i).setTag(true);
//                    }
//
//                }
//                else
//                {
//                    list.get(i).setTag(false);
//                    Button button1 = (Button) view;
//                    button1.setBackground(getDrawable(R.drawable.gray_box));
//                }
//
//
//
//            }
//
//
//
//        }
//    };
}
