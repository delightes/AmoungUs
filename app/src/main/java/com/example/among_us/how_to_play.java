package com.example.among_us;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class how_to_play extends AppCompatActivity {

    private View decorView;
    private int	uiOption;

    ImageView how;
    ImageButton left, right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // 하단바 제거
        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility( uiOption );


        how = (ImageView)findViewById(R.id.how_to_play);
        left = (ImageButton)findViewById(R.id.how_to_play_left);
        right = (ImageButton)findViewById(R.id.how_to_play_right);

    }

    private int num = 1;
    public void right_onClick(View view) {
        num++;

        switch (num){
            case 2:
                how.setImageResource(R.drawable.how_to_play_2);
                left.setVisibility(View.VISIBLE);
                break;
            case 3:
                how.setImageResource(R.drawable.how_to_play_3);
                break;
            case 4:
                how.setImageResource(R.drawable.how_to_play_4);
                break;
            case 5:
                how.setImageResource(R.drawable.how_to_play_5);
                break;
            case 6:
                how.setImageResource(R.drawable.how_to_play_6);
                right.setVisibility(View.GONE);
                break;

        }
    }

    public void left_onClick(View view) {
        num--;

        switch (num) {
            case 1:
                how.setImageResource(R.drawable.how_to_play_1);
                left.setVisibility(View.GONE);
                break;
            case 2:
                how.setImageResource(R.drawable.how_to_play_2);
                break;
            case 3:
                how.setImageResource(R.drawable.how_to_play_3);
                break;
            case 4:
                how.setImageResource(R.drawable.how_to_play_4);
                break;
            case 5:
                how.setImageResource(R.drawable.how_to_play_5);
                right.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void esc_onClick(View view) {
        super.onBackPressed();
    }
}