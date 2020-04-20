package com.example.spinwheel;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView wheel;
    TextView textView;

    Random r;

    int degree =0,degree_old =0;
    private static final float Factor= 4.86f;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        textView= findViewById(R.id.textView);
        wheel= findViewById(R.id.wheel);

        r=new Random();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                degree_old=degree % 360;
                degree = r.nextInt(3600) + 720;
                RotateAnimation rotate=new RotateAnimation(degree_old,degree, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360-(degree%360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                wheel.startAnimation(rotate);
            }
        });

        configureBack();
    }

    private void configureBack() {
        Button Back = findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Menu.class));
            }
        });
    }

    private String currentNumber(int degrees){
        String text="";

        if(degrees>=(Factor*1)&& degrees<(Factor*3)){
        //Insert drinks here
            text ="Water";
        }
        if(degrees>=(Factor*3)&& degrees<(Factor*5)){
            //Insert drinks here
            text ="Corona";
        }
        if(degrees>=(Factor*5)&& degrees<(Factor*7)){
            //Insert drinks here
            text ="Orchard Thieves";

        }
        if(degrees>=(Factor*7)&& degrees<(Factor*9)){
            //Insert drinks here
            text ="Jameson and Ginger Ale";

        }
        if(degrees>=(Factor*9)&& degrees<(Factor*11)){
            //Insert drinks here
            text ="Heineken";

        }
        if(degrees>=(Factor*11)&& degrees<(Factor*13)){
            //Insert drinks here
            text ="Bulmers";

        }
        if(degrees>=(Factor*13)&& degrees<(Factor*15)){
            //Insert drinks here
            text ="Malibu and Lucozade";

        }
        if(degrees>=(Factor*15)&& degrees<(Factor*17)){
            //Insert drinks here
            text ="Coors Light";

        }
        if(degrees>=(Factor*17)&& degrees<(Factor*19)){
            //Insert drinks here
            text ="Appleman's";

        }if(degrees>=(Factor*19)&& degrees<(Factor*21)){
            //Insert drinks here
            text ="Rum and a Mixer";

        }if(degrees>=(Factor*21)&& degrees<(Factor*23)){
            //Insert drinks here
            text ="Guinness";

        }if(degrees>=(Factor*23)&& degrees<(Factor*25)){
            //Insert drinks here
            text ="Rockshore Cider";

        }if(degrees>=(Factor*25)&& degrees<(Factor*27)){
            //Insert drinks here
            text ="Vodka and a Mixer";

        }if(degrees>=(Factor*27)&& degrees<(Factor*29)){
            //Insert drinks here
            text ="Water";

        }if(degrees>=(Factor*29)&& degrees<(Factor*31)){
            //Insert drinks here
            text ="Guinness Extra Stout";

        }if(degrees>=(Factor*31)&& degrees<(Factor*33)){
            //Insert drinks here
            text ="Whiskey and a Mixer";

        }if(degrees>=(Factor*33)&& degrees<(Factor*35)){
            //Insert drinks here
            text ="Fosters";

        }if(degrees>=(Factor*35)&& degrees<(Factor*37)){
            //Insert drinks here
            text ="Cooneys";

        }if(degrees>=(Factor*37)&& degrees<(Factor*39)){
            //Insert drinks here
            text ="Jager Bomb";

        }if(degrees>=(Factor*39)&& degrees<(Factor*41)){
            //Insert drinks here
            text ="Rockshore Lager";

        }if(degrees>=(Factor*41)&& degrees<(Factor*43)){
            //Insert drinks here
            text ="Sambuca";

        }if(degrees>=(Factor*43)&& degrees<(Factor*45)){
            //Insert drinks here
            text ="Smithwick's";

        }if(degrees>=(Factor*45)&& degrees<(Factor*47)){
            //Insert drinks here
            text ="Tequila";

        }if(degrees>=(Factor*47)&& degrees<(Factor*49)){
            //Insert drinks here
            text ="Carlsberg";

        }if(degrees>=(Factor*49)&& degrees<(Factor*51)){
            //Insert drinks here
            text ="Bacardi and a Mixer";

        }if(degrees>=(Factor*51)&& degrees<(Factor*53)){
            //Insert drinks here
            text ="Peroni";

        }
        if(degrees>=(Factor*53)&& degrees<(Factor*55)){
            //Insert drinks here
            text ="WKD";

        }if(degrees>=(Factor*55)&& degrees<(Factor*57)){
            //Insert drinks here
            text ="Water";

        }if(degrees>=(Factor*57)&& degrees<(Factor*59)){
            //Insert drinks here
            text ="Budweiser";

        }if(degrees>=(Factor*59)&& degrees<(Factor*61)){
            //Insert drinks here
            text ="Gin and a Mixer";

        }if(degrees>=(Factor*61)&& degrees<(Factor*63)){
            //Insert drinks here
            text ="Hop House 13";

        }if(degrees>=(Factor*63)&& degrees<(Factor*65)){
            //Insert drinks here
            text ="Whiskey Sour";

        }if(degrees>=(Factor*65)&& degrees<(Factor*67)){
            //Insert drinks here
            text ="Desporados";

        }if(degrees>=(Factor*67)&& degrees<(Factor*69)){
            //Insert drinks here
            text ="Baby Guinness";

        }if(degrees>=(Factor*69)&& degrees<(Factor*71)){
            //Insert drinks here
            text ="Tuborg";

        }if(degrees>=(Factor*71)&& degrees<(Factor*73)){
            //Insert drinks here
            text ="Absinthe";

        }
        if(degrees>=(Factor*73)&& degrees<360||(degrees>=0 && degrees<(Factor*1))){
            //Insert drinks here
            text ="Erdinger";

        }

        return text;
    }
}
