package com.example.presidentsofusa.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.presidentsofusa.R;
import com.example.presidentsofusa.activity.Description;
import com.example.presidentsofusa.model.President;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentAdapter extends RecyclerView.Adapter <PresidentAdapter.PresidentViewHolder> {
    Context mContext;
    List<President> lstPresident;

    public PresidentAdapter(Context mContext, List<President> lstPresident){
        this.mContext=mContext;
        this.lstPresident=lstPresident;
    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.presidents,parent,false);
        return new PresidentViewHolder(view, mContext, lstPresident);

    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, int position) {

        President president=lstPresident.get(position);

        holder.image.setImageResource(president.getImageId());
        holder.txtPresident_name.setText(president.getName());


    }



    @Override
    public int getItemCount() {
       return lstPresident.size();
    }

    public class PresidentViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView txtPresident_name, description;
        Context mContext;
        List<President> list;

        public PresidentViewHolder(@NonNull View itemView, Context context, final List<President> list) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
          txtPresident_name=itemView.findViewById(R.id.txtPresident_name);
          this.mContext = context;
          this.list = list;
          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  President pres;
                  pres = list.get(getAdapterPosition());

                Intent intent = new Intent(mContext, Description.class);
                  intent.putExtra("name", pres.getName());
                  intent.putExtra("image", pres.getImageId());
                  intent.putExtra("desc", pres.getDescription());

                mContext.startActivity(intent);
              }
          });
        }
    }
}
