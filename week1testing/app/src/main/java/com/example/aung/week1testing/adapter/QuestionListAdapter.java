package com.example.aung.week1testing.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aung.week1testing.R;
import com.example.aung.week1testing.viewHolder.QuestionListViewHolder;

/**
 * Created by aung on 1/3/18.
 */

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListViewHolder> {

    private LayoutInflater layoutInflater;

    public QuestionListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public QuestionListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.question_list_item, parent, false);
        return new QuestionListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(QuestionListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
