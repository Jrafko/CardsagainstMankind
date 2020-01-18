package com.example.cardsagainstmankind;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class GameLobby extends AppCompatActivity {
    Button startButton;
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    TextView roomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_lobby);

        startButton = findViewById(R.id.startButton);
        roomText = findViewById(R.id.roomCodeText);
        p1 = findViewById(R.id.player1Text);
        p2 = findViewById(R.id.player1Text2);
        p3 = findViewById(R.id.player1Text3);
        //TODO: Set rest up

    }
}
