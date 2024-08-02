package com.example.puzzle;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
       Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,btnSeven,btnEight,btnNine;
       @Override
       protected void onCreate(Bundle savedInstanceState){
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           btnOne=findViewById(R.id.btnOne);
           btnTwo=findViewById(R.id.btnTwo);
           btnThree=findViewById(R.id.btnThree);
           btnFour=findViewById(R.id.btnFour);
           btnFive=findViewById(R.id.btnFive);
           btnSix=findViewById(R.id.btnSix);
           btnSeven=findViewById(R.id.btnSeven);
           btnEight=findViewById(R.id.btnEight);
           btnNine=findViewById(R.id.btnNine);


           btnOne.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnTwo.getText().toString().equals("2") &&
                           btnFour.getText().toString().equals("4") &&
                           btnOne.getText().toString().equals("1")) {
                       // Puzzle is solved
                       Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnTwo.getText().toString().contains("none")){
                           Drawable image= btnOne.getBackground();
                           btnOne.setBackground(btnTwo.getBackground());
                           btnOne.setText("none");
                           btnTwo.setText("1");
                           btnTwo.setBackground(image);
                       }
                       if(btnFour.getText().toString().contains("none")){
                           Drawable image= btnOne.getBackground();
                           btnOne.setBackground(btnFour.getBackground());
                           btnOne.setText("none");
                           btnFour.setText("1");
                           btnFour.setBackground(image);
                       }
                   }
               }
           });

           btnTwo.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnOne.getText().toString().equals("1") &&
                           btnThree.getText().toString().equals("3") &&
                           btnFive.getText().toString().equals("5") &&
                           btnTwo.getText().toString().equals("2")) {
                       // Puzzle is solved
                       Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnOne.getText().toString().contains("none")){
                           Drawable image= btnTwo.getBackground();
                           btnTwo.setBackground(btnOne.getBackground());
                           btnTwo.setText("none");
                           btnOne.setText("2");
                           btnOne.setBackground(image);

                       }
                       if(btnThree.getText().toString().contains("none")){
                           Drawable image= btnTwo.getBackground();
                           btnTwo.setBackground(btnThree.getBackground());
                           btnTwo.setText("none");
                           btnThree.setText("2");
                           btnThree.setBackground(image);

                       }
                       if(btnFive.getText().toString().contains("none")){
                           Drawable image= btnTwo.getBackground();
                           btnTwo.setBackground(btnFive.getBackground());
                           btnTwo.setText("none");
                           btnFive.setText("2");
                           btnFive.setBackground(image);

                       }
                   }
               }
           });

           btnThree.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnTwo.getText().toString().equals("2") &&
                           btnSix.getText().toString().equals("6") &&
                           btnThree.getText().toString().equals("3")) {
                       // Puzzle is solved

                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnTwo.getText().toString().contains("none")){
                           Drawable image= btnThree.getBackground();
                           btnThree.setBackground(btnTwo.getBackground());
                           btnThree.setText("none");
                           btnTwo.setText("3");
                           btnTwo.setBackground(image);

                       }
                       if(btnSix.getText().toString().contains("none")){
                           Drawable image= btnThree.getBackground();
                           btnThree.setBackground(btnSix.getBackground());
                           btnThree.setText("none");
                           btnSix.setText("3");
                           btnSix.setBackground(image);

                       }
                   }
               }
           });

           btnFour.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnOne.getText().toString().equals("1") &&
                           btnFive.getText().toString().equals("5") &&
                           btnSeven.getText().toString().equals("7") &&
                           btnFour.getText().toString().equals("4")) {
                       // Puzzle is solved

                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnOne.getText().toString().contains("none")){
                           Drawable image= btnFour.getBackground();
                           btnFour.setBackground(btnOne.getBackground());
                           btnFour.setText("none");
                           btnOne.setText("4");
                           btnOne.setBackground(image);

                       }
                       if(btnFive.getText().toString().contains("none")){
                           Drawable image= btnFour.getBackground();
                           btnFour.setBackground(btnFive.getBackground());
                           btnFour.setText("none");
                           btnFive.setText("4");
                           btnFive.setBackground(image);

                       }
                       if(btnSeven.getText().toString().contains("none")) {
                           Drawable image = btnFour.getBackground();
                           btnFour.setBackground(btnSeven.getBackground());
                           btnFour.setText("none");
                           btnSeven.setText("4");
                           btnSeven.setBackground(image);

                       }
                   }
               }
           });

           btnFive.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnTwo.getText().toString().equals("2") &&
                           btnFour.getText().toString().equals("4") &&
                           btnSix.getText().toString().equals("6") &&
                           btnEight.getText().toString().equals("8") &&
                           btnFive.getText().toString().equals("5")) {
                       // Puzzle is solved
                       Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnFour.getText().toString().contains("none")){
                           Drawable image= btnFive.getBackground();
                           btnFive.setBackground(btnFour.getBackground());
                           btnFive.setText("none");
                           btnFour.setText("5");
                           btnFour.setBackground(image);

                       }
                       if(btnSix.getText().toString().contains("none")){
                           Drawable image= btnFive.getBackground();
                           btnFive.setBackground(btnSix.getBackground());
                           btnFive.setText("none");
                           btnSix.setText("5");
                           btnSix.setBackground(image);

                       }
                       if(btnEight.getText().toString().contains("none")){
                           Drawable image= btnFive.getBackground();
                           btnFive.setBackground(btnEight.getBackground());
                           btnFive.setText("none");
                           btnEight.setText("5");
                           btnEight.setBackground(image);

                       }
                   }
               }
           });
           btnSix.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnThree.getText().toString().equals("3") &&
                           btnFive.getText().toString().equals("5") &&
                           btnNine.getText().toString().equals("9") &&
                           btnSix.getText().toString().equals("6")) {
                       // Puzzle is solved
                       Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnThree.getText().toString().contains("none")){
                           Drawable image= btnSix.getBackground();
                           btnSix.setBackground(btnThree.getBackground());
                           btnSix.setText("none");
                           btnThree.setText("6");
                           btnThree.setBackground(image);

                       }
                       if(btnFive.getText().toString().contains("none")){
                           Drawable image= btnSix.getBackground();
                           btnSix.setBackground(btnFive.getBackground());
                           btnSix.setText("none");
                           btnFive.setText("6");
                           btnFive.setBackground(image);
                           Toast.makeText(MainActivity.this, "yo, Almost there", Toast.LENGTH_SHORT).show();

                       }
                       if(btnNine.getText().toString().contains("none")){
                           Drawable image= btnSix.getBackground();
                           btnSix.setBackground(btnNine.getBackground());
                           btnSix.setText("none");
                           btnNine.setText("6");
                           btnNine.setBackground(image);


                       }
                   }
               }
           });
           btnSeven.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnFour.getText().toString().equals("4") &&
                           btnEight.getText().toString().equals("8") &&
                           btnSeven.getText().toString().equals("7")) {
                       // Puzzle is solved
                       Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnFour.getText().toString().contains("none")){
                           Drawable image= btnSeven.getBackground();
                           btnSeven.setBackground(btnFour.getBackground());
                           btnSeven.setText("none");
                           btnFour.setText("7");
                           btnFour.setBackground(image);
                           Toast.makeText(MainActivity.this, "yo, Almost there", Toast.LENGTH_SHORT).show();

                       }
                       if(btnEight.getText().toString().contains("none")){
                           Drawable image= btnSeven.getBackground();
                           btnSeven.setBackground(btnEight.getBackground());
                           btnSeven.setText("none");
                           btnEight.setText("7");
                           btnEight.setBackground(image);


                       }
                   }
               }
           });
           btnEight.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                       if (btnFive.getText().toString().equals("5") &&
                               btnSeven.getText().toString().equals("7") &&
                               btnNine.getText().toString().equals("9") &&
                               btnEight.getText().toString().equals("8")) {
                           Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                       } else {
                           // Puzzle is not solved, perform swapping logic
                           if(btnFive.getText().toString().contains("none")){
                               Drawable image= btnEight.getBackground();
                               btnEight.setBackground(btnFive.getBackground());
                               btnEight.setText("none");
                               btnFive.setText("8");
                               btnFive.setBackground(image);

                           }
                           if(btnSeven.getText().toString().contains("none")){
                               Drawable image= btnEight.getBackground();
                               btnEight.setBackground(btnSeven.getBackground());
                               btnEight.setText("none");
                               btnSeven.setText("8");
                               btnSeven.setBackground(image);
                               Toast.makeText(MainActivity.this, "yo, Almost there", Toast.LENGTH_SHORT).show();

                           }
                           if(btnNine.getText().toString().contains("none")) {
                               Drawable image = btnEight.getBackground();
                               btnEight.setBackground(btnNine.getBackground());
                               btnEight.setText("none");
                               btnNine.setText("8");
                               btnNine.setBackground(image);

                           }
                       }
                   }
               });
           btnNine.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (btnSix.getText().toString().equals("6") &&
                           btnEight.getText().toString().equals("8") &&
                           btnNine.getText().toString().equals("9")) {
                       // Puzzle is solved
                       Toast.makeText(MainActivity.this, "Puzzle Solved!", Toast.LENGTH_SHORT).show();
                   } else {
                       // Puzzle is not solved, perform swapping logic
                       if(btnSix.getText().toString().contains("none")){
                           Drawable image= btnNine.getBackground();
                           btnNine.setBackground(btnSix.getBackground());
                           btnNine.setText("none");
                           btnSix.setText("9");
                           btnSix.setBackground(image);

                       }
                       if(btnEight.getText().toString().contains("none")){
                           Drawable image= btnNine.getBackground();
                           btnNine.setBackground(btnEight.getBackground());
                           btnNine.setText("none");
                           btnEight.setText("9");
                           btnEight.setBackground(image); Toast.makeText(MainActivity.this, "Puzzle Solved", Toast.LENGTH_SHORT).show();

                       }
                   }
               }
           });


       }

}