package com.example.blackcheck.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.blackcheck.R;

public class MainActivity extends AppCompatActivity {
    private ImageView imgStart ;
    private Button btentrar;
    private TextView txtRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgStart = findViewById(R.id.img_start);
        btentrar = findViewById(R.id.btEntrar);
        txtRegistrar = findViewById(R.id.txtRegistrar);
        txtRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastroActivity.class);
                startActivity(intent);
            }
        });
        fadeOutImage();


    }

        private void fadeOutImage() {
            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imgStart, View.ALPHA, 0);
            //Tempo, em milisegundos, da sua animação. Caso não coloque nenhum, o default é 300.
            objectAnimator.setDuration(200);
            /*Aqui esta a mágica. Você define o tempo (em milisegundos) para sua animação começar.
             * Ou seja, depois de 2 segundos, sua ImageView ira começar a desaparecer
             */
            objectAnimator.setStartDelay(2000);
            //Caso você queira um Listener para o termino da animação
            objectAnimator.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {

                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
            objectAnimator.start();
    }
}
