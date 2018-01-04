package com.example.aung.week1testing.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aung.week1testing.R;
import com.example.aung.week1testing.adapter.QuestionListAdapter;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_detail_item);
//
//        RecyclerView rvNews = findViewById(R.id.question_list);
//        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
//        QuestionListAdapter questionListAdapter = new QuestionListAdapter(getApplicationContext());
//        rvNews.setAdapter(questionListAdapter);
    }
}
