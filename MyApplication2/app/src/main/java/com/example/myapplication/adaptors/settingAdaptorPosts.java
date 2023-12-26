package com.example.myapplication.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.Arrays;

import java.util.List;

public class settingAdaptorPosts extends RecyclerView.Adapter<settingAdaptorPosts.SettingViewHolder>{


    List<Integer> PostItr=Arrays.asList(1, 2, 3, 4, 5, 8);
    @NonNull
    @Override
    public SettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.activity_post,parent,false);
        return new SettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return PostItr.size();
    }

    class SettingViewHolder extends RecyclerView.ViewHolder {

        public SettingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
