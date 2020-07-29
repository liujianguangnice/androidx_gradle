package com.ed.androidxdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout cl = findViewById(R.id.cl_root);
        ImageView ivImage = findViewById(R.id.ivImage);
        CardView cardView = new CardView(this);
        cardView.setCardBackgroundColor(Color.RED);
        cardView.setLayoutParams(new ViewGroup.LayoutParams(300,300));

        cl.addView(cardView);

        Glide.with(this)
                //.load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1596033072369&di=a54134a9669d7f1884d761379f0917d9&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20190725%2F01060632dcdd4fcc8455d01dd59deeae.jpeg")
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1596033072369&di=a54134a9669d7f1884d761379f0917d9&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20190725%2F01060632dcdd4fcc8455d01dd59deeae.jpeg")
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        e.logRootCauses("Glide");
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        return false;
                    }
                })
                .into(ivImage);
    }
}
