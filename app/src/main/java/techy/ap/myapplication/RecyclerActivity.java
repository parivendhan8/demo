package techy.ap.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import techy.ap.myapplication.RecyclerActivity.CustAdapter.MyViewHolder;

public class RecyclerActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(""));
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(""));
    Button submit;

    Boolean tag = false;
    Boolean tag2 = false;
    private static final String TAG = "RecyclerActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.custom_checkbox);
        setContentView(R.layout.activity_recyclerview);

//        arrayList.clear();

        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        final CustAdapter adapter = new CustAdapter(getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter);

        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tag = true;
//                adapter.notifyDataSetChanged();

                adapter.addDynamic();
//
//                Log.d(TAG, "onClick: " + arrayList);

//                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.child, null);
//
//                MyViewHolder viewHolder= (MyViewHolder ) recyclerView.findViewHolderForAdapterPosition(adapter.getItemCount()-1);
//                ((ViewGroup) viewHolder.itemView).addView(view);
//                adapter.notifyDataSetChanged();


            }
        });


        Button button = findViewById(R.id.submit2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<adapter.getItemCount();i++){
                    MyViewHolder viewHolder= (MyViewHolder ) recyclerView.findViewHolderForAdapterPosition(i);
                    String s = viewHolder.textView_name.getText().toString();
                    list.add(s);

                    Log.d(TAG, "onClick: " + s);
                }

                Log.d(TAG, "onClick: " + list);
            }
        });

    }

    public class CustAdapter extends RecyclerView.Adapter<CustAdapter.MyViewHolder>{

        ArrayList<String> arrayList = new ArrayList<String>();
        Context context;

        public CustAdapter(Context context , ArrayList<String> arrayList) {
            this.context = context;
            this.arrayList = arrayList;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.child, null);
            return new MyViewHolder(view);

        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {




            if (arrayList.size() == 1)
            {
                holder.textView_name.setText("Prem ");
                holder.tv_location.setText("Coimbatore ");
                holder.tv_mobile.setText("9042298545 ");
                Log.d(TAG, "onBindViewHolder: " + "it is empty");
            }

//            holder.textView.setCompoundDrawablesWithIntrinsicBounds();

//            if (tag)
//            {
//                if (arrayList.size() - 1 == i)
//                {
//                    tag = false;
//                    arrayList.add("");
//                    holder.textView.setFocusable(true);
//                }
//
//            }


        }

        public void addDynamic()
        {
            arrayList.add("" + arrayList.size());
            notifyDataSetChanged();
        }



        @Override
        public int getItemCount() {
            return arrayList.size();
        }

       public class MyViewHolder extends RecyclerView.ViewHolder{

           TextView textView_name;
           TextView tv_location;
           EditText tv_mobile;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                textView_name = (TextView) itemView.findViewById(R.id.textView_name);
                tv_location = (TextView) itemView.findViewById(R.id.tv_location);
                tv_mobile = (EditText) itemView.findViewById(R.id.tv_mobile);


            }


        }

    }
}
