package com.demo.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo.guide.R;

public class HomeActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btn_aty).setOnClickListener(this);
        findViewById(R.id.btn_view).setOnClickListener(this);
        findViewById(R.id.btn_list).setOnClickListener(this);
        findViewById(R.id.btn_frag).setOnClickListener(this);
        findViewById(R.id.btn_frag_view).setOnClickListener(this);
        findViewById(R.id.btn_more).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_aty:
                startActivity(new Intent(HomeActivity.this, FullActivity.class));
                break;
            case R.id.btn_view:
                startActivity(new Intent(HomeActivity.this, ViewActivity.class));
                break;
            case R.id.btn_list:
                startActivity(new Intent(HomeActivity.this, MyListActivity.class));
                break;
            case R.id.btn_frag:
                startActivity(new Intent(HomeActivity.this, FragActivity.class).putExtra("fragmentId", 0));
                break;
            case R.id.btn_frag_view:
                startActivity(new Intent(HomeActivity.this, FragActivity.class).putExtra("fragmentId", 1));
                break;
            case R.id.btn_more:
                startActivity(new Intent(HomeActivity.this, SimpleGuideViewActivity.class));
                break;
        }
    }
}
