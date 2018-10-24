package com.cmy.www.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton togglebutton;
    ProgressBar progressbar01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        togglebutton = (ToggleButton)findViewById(R.id.togglebutton);
        progressbar01 = (ProgressBar)findViewById(R.id.progressbar1);
        progressbar01.setVisibility(View.GONE);
//        progressbar01.setVisibility(View.INVISIBLE);



    }

    public void onclickwidget(View view){
//        String text = togglebutton.getText()+"-"+togglebutton.isChecked();
        String text1 = ((ToggleButton)view).getText().toString();
        TextView textView =(TextView)findViewById(R.id.textview);



        if(togglebutton.isChecked())
            progressbar01.setVisibility(View.VISIBLE);



        else
            progressbar01.setVisibility(View.GONE);
//        progressbar01.setVisibility(View.INVISIBLE);

        textView.setText(text1);
//        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();

    }


}
