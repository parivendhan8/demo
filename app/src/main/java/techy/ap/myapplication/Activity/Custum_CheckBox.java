package techy.ap.myapplication.Activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.annotation.RequiresApi;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import techy.ap.myapplication.R;
import techy.ap.myapplication.Retrofit.PostActivity;

public class Custum_CheckBox extends BaseAcitvity {

    private static final String TAG = "Custum_CheckBox";
    private ArrayList<Dummy> list;
    private AutoCompleteTextView editText;
    private Button button;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.custom_checkbox);

       final ArrayList<Dummy> list = new ArrayList<Dummy>();

        list.add(new Dummy("1", "one"));
        list.add(new Dummy("1", "one"));
        list.add(new Dummy("1", "one"));
        list.add(new Dummy("1", "two"));
        list.add(new Dummy("1", "three"));
        list.add(new Dummy("1", "four"));
        list.add(new Dummy("1", "one"));


        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

//        ArrayAdapter<Dummy> arrayAdapter = new ArrayAdapter<Dummy>(this, android.R.layout.simple_list_item_1, list);
//        editText.setThreshold(0);
//        editText.setAdapter(arrayAdapter);





        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {


//                Intent intent = new Intent(getApplicationContext(), Empty.class);
//                Bundle bundle = new Bundle();
//                Object obj = list;
//                bundle.putSerializable("bundle", (Serializable) obj);
//                intent.putExtra("key",bundle);
//                startActivity(intent);

//                Intent intent = new Intent(Custum_CheckBox.this, Empty.class);
//                String data = toJson(list);
//                intent.putExtra("key", data);
//                startActivity(intent);

                startActivity(new Intent(Custum_CheckBox.this, PostActivity.class));


            }
        });





//        ArrayList<String> arrayList = getId(list);
//
//        ListWrapper<Dummy> dummy = null;
//
//        ListWrapper<Dummy> Dummy = dummy;


//        ArrayAdapter<Dummy> arrayAdapter = new ArrayAdapter<Dummy>(this, android.R.layout.simple_spinner_dropdown_item, Dummy.items);


    }

    private ArrayList<String> getId(ListWrapper o) {


        List items = o.items;

        return null;
    }

    public void onClicButton(View view) {



    }

    public class ListWrapper<T> {
        List<T> items;
    }


    public class Dummy implements Serializable{

        public String id;
        public String name;

        public Dummy(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}


