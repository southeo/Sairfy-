package com.example.soulaine.perspectives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dinList(View view){
        Intent Dining = new Intent(this, displayDiningList.class);
        startActivity(Dining);
    }   //Displays dining

    public void recList(View view){
        Intent Recreation = new Intent(this, displayRecList.class);
        startActivity(Recreation);
    }   //Displays Recreation

    public void transList(View view){
        Intent Transit = new Intent(this, displayTransList.class);
        startActivity(Transit);
    }  //Displays Transit

    public void evList(View view){
        Intent Finances = new Intent(this, displayEventsList.class);
        startActivity(Finances);
    }     //Displays Financial Services

    public void list1(View view){           //Displays Health and Medicine
        Intent Health = new Intent(this, displayHealthCare.class);
        startActivity(Health);
    }   //Displays health and medicine

    public void filter(View view){
        Intent filters = new Intent(this, filterReviews.class);
        startActivity(filters);
    }
}
