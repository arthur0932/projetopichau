package com.example.projetopichau;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class NvidiaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvidia);

        ImageView banner = findViewById(R.id.imageView8);
        String imageUrl = "https://lh3.googleusercontent.com/gg-dl/AAQ_wbE4ku5FHfs2kP61Vr5bqM3GIdFkLaapsEnCglrlv5bkGPZdnkOEFhA5-rARzYPvSTpvrkPD6Sd_LPx4c4dgs1akFeoQnwV05WRnyved56OdXBQsRa2SgpbjJbMCsk5vQzaDK_nj7xuUIjHpBxCgMZNmKx0_ZJWkd3654l9JIteS-FUyQg=s1024-rj";
        
        Glide.with(this)
             .load(imageUrl)
             .into(banner);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}