package nkust.schoolpay;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
    }

    public void registButton(View view) {
        this.setContentView(R.layout.regist_page);
    }

    public void confirm(View view) {
        this.setContentView(R.layout.menu_page);
    }

    public void registConfirm(View view) {
        this.setContentView(R.layout.activity_main);
    }
}
