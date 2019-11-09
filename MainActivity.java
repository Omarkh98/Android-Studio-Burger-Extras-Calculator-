package com.example.burgerking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar SB;
    private TextView TV;
    private RadioGroup RG1;
    private RadioGroup RG2;
    private RadioButton RB1;
    private RadioButton RB2;
    private CheckBox CB;
    private int MyCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainBurger Burger = new MainBurger();

        SB = findViewById(R.id.Bar);
        TV = findViewById(R.id.Calories);
        RG1 = findViewById(R.id.RadioGroup1);
        RG2 = findViewById(R.id.RadioGroup2);
        CB =  findViewById(R.id.Checkbox);

        RG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {  // Calculate Burger Value From First Radio-Group.
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int ID = RG1.getCheckedRadioButtonId();
                RB1 = findViewById(ID);
                if(RB1.getId() ==R.id.Choice1){
                    Burger.Burger(1);
                }
                else if(RB1.getId() ==R.id.Choice2){
                    Burger.Burger(2);
                }
                else if(RB1.getId() == R.id.Choice3){
                    Burger.Burger(3);
                }

                MyCounter = Burger.CalculateCalories();
                TV.setText("Calories : "+ MyCounter);
            }
        });

        RG2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {  // Calculate Burger Value From Second Radio-Group.
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int ID = RG2.getCheckedRadioButtonId();
                RB2 = findViewById(ID);
                if(RB2.getId()==R.id.Choice4) {
                    Burger.Cheese(1);
                }
                else{
                    Burger.Cheese(3);
                }
                MyCounter = Burger.CalculateCalories();
                TV.setText("Calories : "+ MyCounter);
            }
        });

        CB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {  // Calculate Onions Value From Checkbox.
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Burger.Onions(isChecked);
                } else {
                    Burger.Onions(isChecked);
                }
                MyCounter = Burger.CalculateCalories();
                TV.setText("Calories : " + MyCounter);
            }
        });

        SB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            int MyProgress;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                MyProgress = progress;
                TV.setText("Calories: "+(MyCounter + seekBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
