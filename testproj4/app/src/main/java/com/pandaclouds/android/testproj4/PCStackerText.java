package com.pandaclouds.android.testproj4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pandaclouds.android.pages.sdk.PCJSON;

public class PCStackerText extends LinearLayout {

//    private ImageView mHeroIcon;
//    private ImageView mHeroTitle;
    private String text;
    private String hello;

    private TextView label;
    private Context context;

    public PCStackerText(Context context) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.my_text_view, this);

        loadViews();
    }

    public PCStackerText(Context context, PCJSON json) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.my_text_view, this);
        text = json.getString("text");


        loadViews();
    }

    public PCStackerText(Context context, AttributeSet attrs) {
        super(context, attrs);

//        LayoutInflater inflater = LayoutInflater.from(context);
//        inflater.inflate(R.layout.my_text_view, this);

        loadViews();
    }

    private void loadViews() {

        label = (TextView) findViewById(R.id.text_1);



    }


    public void setText(String name) {
        text= name;
        label.setText("::" + name + "::");
    }

//    public void setHeroIcon(Drawable icon) {
//        mHeroIcon.setImageDrawable(icon);
//    }

//    public void setHeroTitle(Drawable title) {
//        mHeroTitle.setImageDrawable(title);
//    }



}
