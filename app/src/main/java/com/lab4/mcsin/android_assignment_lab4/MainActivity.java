package com.lab4.mcsin.android_assignment_lab4;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements TextWatcher
{
    //Declare variables here - inside the class but outside of any function
    //to make them accessible to other functions. Make them private so that
    //no other class can manipulate their values(only this class's functions
    //can manipulate the values)

    private EditText input1;
    private TextView output1;
    private  TextView output2;







    @Override
    public void onCreate(Bundle savedData)
    {

        super.onCreate(savedData);

        // Create and initialize the layout
        LinearLayout myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);

        //Instantiate the controls (create them in memory)
        input1 = new EditText(this);
        output1 = new TextView(this);
        output2 = new TextView(this);

        TextView label1 = new TextView(this);
        label1.setText("Please Enther the Number of Cups:");
        input1.setInputType(InputType.TYPE_CLASS_NUMBER);


        //Register input EditText to use TextListener
        input1.addTextChangedListener(this);




        //Create a LayoutParams object
        LinearLayout.LayoutParams lparams =new LinearLayout.LayoutParams(300,100);// Width , height



        // Use the LayoutParams object to set the control widths and heights
        label1.setLayoutParams(lparams);
        input1.setLayoutParams(lparams);
        output1.setLayoutParams(lparams);
        output2.setLayoutParams(lparams);

        //Add the controls to the layout. The order you add them determines
        //the order they will appear on the display
        myLayout.addView(label1);
        myLayout.addView(input1);
        myLayout.addView(output1);//Appears under the button
        myLayout.addView(output2);//Appears under the button

        setContentView(myLayout);
    }



    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        //Future use if desired
    }
    //If text gets changed in any listening objects registered to listen to
    //this global TextWatcher
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        output1.setText("The teaspoons of number are:"+input1.getText());
        int tablespoons=Integer.parseInt(input1.getText().toString())+5;
        output2.setText("The tablespoons of number are:" + tablespoons);
    }

    @Override
    public void afterTextChanged(Editable s) {
        //Future use if desired
    }
}//end if class block


