package nkust.schoolpay;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioRecord;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Vibrator;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private Button loginConfirmButton; //登入介面的登入鍵
    private Button loginRegistButton; //登入介面的註冊鍵
    private EditText loginAccount;
    private EditText loginPassword;
    //private Button setPositiveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        loginAccount = (EditText) findViewById(R.id.editText2);
        loginPassword = (EditText) findViewById(R.id.editText);
        loginConfirmButton = (Button) findViewById(R.id.loginbtn);
        loginRegistButton = (Button) findViewById(R.id.registbtn);
        loginConfirmButton.setOnClickListener(loginPageListener);
        loginRegistButton.setOnClickListener(loginPageListener);

    }

    private Button.OnClickListener loginPageListener =
            new Button.OnClickListener(){
                @Override
                public void onClick(View v){
                    //loginConfirmButton觸發事件
                    switch (v.getId()){
                        case R.id.loginbtn:
                            Toast t = Toast.makeText(MainActivity.this,"密碼錯誤",Toast.LENGTH_SHORT);
                            t.show();
                        case R.id.registbtn:
                            new AlertDialog.Builder(MainActivity.this).setTitle("警告").setMessage("確定要註冊嗎?")
                            .setPositiveButton("我他媽的確定",new DialogInterface.OnClickListener(){
                                public void onClick(DialogInterface dialoginterface,int i){
                                    setContentView(R.layout.regist_page);
                                }
                            }).show();
                    }
                }
            };

}
