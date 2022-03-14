package com.example.retrofitapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserViewHolder> {
    private List<UserModel> userModels;
    Context context;

    public AdapterUser(List<UserModel> userModels, Context context) {
        this.userModels = userModels;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.info_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.title.setText("Title :"+userModels.get(position).getTitle());
        holder.uid.setText("User Id : "+userModels.get(position).getUid());
        holder.id.setText(" Id : "+userModels.get(position).getId());
        if (userModels.get(position).getCompleted() == "true"){
            holder.com.setImageResource(R.drawable.true_);
        }else{
            holder.com.setImageResource(R.drawable.false_);
        }


    }


    @Override
    public int getItemCount() {
        return userModels.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView title,uid,id;
        ImageView com;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.tv_title);
            uid = itemView.findViewById(R.id.tv_user_id);
            id = itemView.findViewById(R.id.tv_id);
            com = itemView.findViewById(R.id.img_completed);


        }
    }
}
