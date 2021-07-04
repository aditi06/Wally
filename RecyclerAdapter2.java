package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>{
    List<String> workOpportunities;
    List<String> websites;
    List<String> descriptions;

    public RecyclerAdapter2(List<String> workOpportunities, List<String> websites, List<String> descriptions){
        this.workOpportunities = workOpportunities;
        this.websites = websites;
        this.descriptions = descriptions;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup main, int t) {
        LayoutInflater layoutInflater = LayoutInflater.from(main.getContext());
        View img = layoutInflater.inflate(R.layout.componentlayout2, main, false);
        ViewHolder holdContent = new ViewHolder(img);
        return holdContent;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder constraint, int count) {
        constraint.header.setText(workOpportunities.get(count));
        constraint.description.setText(descriptions.get(count));
    }

    @Override
    public int getItemCount() {
        return workOpportunities.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView pic;
        TextView header;
        TextView description;
        public ViewHolder(@NonNull View object){
            super(object);
            pic = object.findViewById(R.id.icon);
            header = object.findViewById(R.id.name);
            description = object.findViewById(R.id.description);
            object.setOnClickListener(this);

            object.setOnLongClickListener(new View.OnLongClickListener(){
                public boolean onLongClick(View view){
                    workOpportunities.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });
        }

        @Override
        public void onClick(View w) {
            Intent changePg = new Intent(Intent.ACTION_VIEW, Uri.parse(websites.get(getAdapterPosition())));
            w.getContext().startActivity(changePg);
        }
    }
}
