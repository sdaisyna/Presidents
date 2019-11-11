package com.example.presidentsofusa.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.presidentsofusa.model.President;
import com.example.presidentsofusa.adapter.PresidentAdapter;
import com.example.presidentsofusa.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        List<President> lstPresident=new ArrayList<>();

        lstPresident.add(new President("Donald Trump","Donald John Trump (born June 14, 1946) is the 45th and current president" +
                " of the United States. Before entering politics, he was a businessman and television personality." , R.drawable.donald));
        lstPresident.add(new President("Hillary Clinton","Hillary Diane Rodham Clinton[2] (born Hillary Diane Rodham; October 26," +
                " 1947) is an American politician, diplomat, lawyer, writer and public speaker. She was First Lady of the United States from 1993 to" +
                " 2001, a United States senator from New York from 2001 to 2009, and the 67th United States secretary of state from 2009 until 2013." , R.drawable.hillary));

        lstPresident.add(new President("Bill Clinton","William Jefferson Clinton (born William Jefferson Blythe III; August 19, 1946) is an " +
                "American politician who served as the 42nd president of the United States from 1993 to 2001.", R.drawable.bill));

        lstPresident.add(new President("Barack Obama","Barack Hussein Obama  born August 4, 1961) is an American attorney and politician who" +
                " served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party, he was the first African American " +
                "to be elected to the presidency.", R.drawable.barack_obama));
        lstPresident.add(new President("Ricard Nixon","Richard Milhous Nixon (January 9, 1913 – April 22, 1994) was an American politician who " +
                "served as the 37th president of the United States from 1969 until his resignation in 1974. The only president to resign from the office, " +
                "he previously served as the nation's 36th vice president from 1953 to 1961, and as a representative and senator from California." , R.drawable.richard));




        PresidentAdapter presidentAdapter = new PresidentAdapter(this,lstPresident);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
