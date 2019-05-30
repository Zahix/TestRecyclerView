package com.example.zahid.testrecyclerview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * Created by Zahid on 30/05/2019.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    private List<String> List;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView test_Text ;
        ImageView test_Image;


        public MyViewHolder(View view) {
            super(view);

            context = view.getContext();
            test_Text = (TextView) view.findViewById(R.id.test_textview);
            test_Image=(ImageView) view.findViewById(R.id.test_imageview) ;




        }
    }
    public Adapter (List<String> list){
        this.List = list;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_activity, parent, false);

        final MyViewHolder holder = new MyViewHolder(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,String.valueOf(holder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
            }
        });

        return holder ;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {



            holder.test_Text.setText(List.get(position));


    }

    @Override
    public int getItemCount() {
        return Common.stringList.size();
    }


}
