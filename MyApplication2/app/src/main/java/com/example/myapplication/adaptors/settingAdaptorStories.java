package com.example.myapplication.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.Arrays;
import java.util.List;

public class settingAdaptorStories extends RecyclerView.Adapter<settingAdaptorStories.StoriesSettingViewHolder> {

    List<Integer> PostItr= Arrays.asList(1, 2, 3, 4, 5, 8,1, 2, 3, 4, 5, 8);

    @NonNull
    @Override
    public StoriesSettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator =LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.activity_story_item,parent,false);

        return new StoriesSettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesSettingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return PostItr.size();
    }


    class StoriesSettingViewHolder extends RecyclerView.ViewHolder {

        public StoriesSettingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
