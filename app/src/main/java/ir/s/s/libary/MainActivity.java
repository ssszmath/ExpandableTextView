package ir.s.s.libary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ir.s.s.expandabletextview.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView myView=new MyView(this);

        myView=(MyView) findViewById(R.id.myview);


        myView.setTextView("سجاد صالح زاده گلدوز از اردبیل هستیس سیبنس صسمیب ئط سنسیس سینمس رمظ.ش دسسینسرئ ظمنی رخسی  سیسسینسزرئسیمسئسئسس سینسی");

    }
}
