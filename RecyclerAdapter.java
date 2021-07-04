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

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    List<String> shelterLocations;
    List<String> websites;
    List<String> descriptions;

    public RecyclerAdapter(List<String> shelterLocations, List<String> websites, List<String> descriptions){
        this.shelterLocations = shelterLocations;
        this.websites = websites;
        this.descriptions = descriptions;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup main, int v) {
        //Log.i(TAG, "onCreateViewHolder: " + count++);
        LayoutInflater layoutInflater = LayoutInflater.from(main.getContext());
        View img = layoutInflater.inflate(R.layout.componentlayout, main, false);
        ViewHolder holdsView = new ViewHolder(img);
        return holdsView;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int count) {
        holder.title.setText(shelterLocations.get(count));
        holder.description.setText(descriptions.get(count));
    }

    @Override
    public int getItemCount() {
        return shelterLocations.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageDisplayed;
        TextView title;
        TextView description;
        public ViewHolder(@NonNull View obj){
            super(obj);
            imageDisplayed = obj.findViewById(R.id.icon);
            title = obj.findViewById(R.id.name);
            description = obj.findViewById(R.id.description);
            obj.setOnClickListener(this);

            obj.setOnLongClickListener(new View.OnLongClickListener(){
                public boolean onLongClick(View view){
                    shelterLocations.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });
        }

        @Override
        public void onClick(View newView) {
            Intent changePage = new Intent(Intent.ACTION_VIEW, Uri.parse(websites.get(getAdapterPosition())));
            newView.getContext().startActivity(changePage);
        }
    }
}
