package com.sinothk.dialog.demo.centerDialog;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.sinothk.dialog.demo.R;

public class CenterDialogDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 弹出对话框！
        setContentView(R.layout.activity_center_dialog_demo_main);
    }

    public void okDialog(View view) {

    }
}
