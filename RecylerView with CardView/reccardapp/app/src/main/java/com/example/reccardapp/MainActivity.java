package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue());
        rcv.setAdapter(adapter);

    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("C Programming");
        ob1.setDesc("Desktop Programming");
        ob1.setImgname(R.drawable.cp);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("C++ Programming");
        ob2.setDesc("Desktop Progamming Language");
        ob2.setImgname(R.drawable.cpp);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Java Programming");
        ob3.setDesc("Desktop Progamming Language");
        ob3.setImgname(R.drawable.java);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("PHP Programming");
        ob4.setDesc("Web Progamming Language");
        ob4.setImgname(R.drawable.php);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader(".NET Programming");
        ob5.setDesc("Desktop/Web Progamming Language");
        ob5.setImgname(R.drawable.dotnet);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Wordpress Framework");
        ob6.setDesc("PHP based Blogging Framework");
        ob6.setImgname(R.drawable.wordpress);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("Magento Framework");
        ob7.setDesc("PHP Based e-Comm Framework");
        ob7.setImgname(R.drawable.magento);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Shopify Framework");
        ob8.setDesc("PHP based e-Comm Framework");
        ob8.setImgname(R.drawable.shopify);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("Angular Programming");
        ob9.setDesc("Web Programming");
        ob9.setImgname(R.drawable.angular);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Python Programming");
        ob10.setDesc("Desktop/Web based Progamming");
        ob10.setImgname(R.drawable.python);
        holder.add(ob10);

        Model ob11=new Model();
        ob11.setHeader("Node JS Programming");
        ob11.setDesc("Web based Programming");
        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);


        return holder;
    }


}
