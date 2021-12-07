/**
 *
 *   Author: Rodrigo Santos, nº mec 89180
 *   -----------------------------------
 *   Dialer Homework CM
 *
 */

package com.example.dialercm;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bCall, b10, b11, bdial1, bdial2, bdial3;
    ImageButton imageButton;
    TextView textView;

    AlertDialog.Builder dialogBuilder;
    AlertDialog dialog;
    EditText speedcontact_firstname, speedcontact_number;
    Button speedCall, speedEdit, speedCancel;

    String speeddial1 = "928931293";
    String speeddialname1 = "Rodrigo";
    String speeddial2 = "916489234";
    String speeddialname2 = "Tatiana";
    String speeddial3 = "939238233";
    String speeddialname3 = "Roberto";
    String newname;
    String newnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        bdial1 = findViewById(R.id.dial1);
        bdial2 = findViewById(R.id.dial2);
        bdial3 = findViewById(R.id.dial3);
        bCall = findViewById(R.id.bCall);

        imageButton = findViewById(R.id.imageButton);
        textView = findViewById(R.id.textView);

        bdial1.setText(speeddialname1);
        bdial2.setText(speeddialname2);
        bdial3.setText(speeddialname3);

        Dexter.withContext(this).withPermission(Manifest.permission.CALL_PHONE).withListener(new PermissionListener() {

            @Override
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {

            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {

            }
        }).check();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("1");
                }
                else{
                    textView.setText(textView.getText().toString() + "1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("2");
                }
                else {
                    textView.setText(textView.getText().toString() + "2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("3");
                }
                else {
                    textView.setText(textView.getText().toString() + "3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("4");
                }
                else {
                    textView.setText(textView.getText().toString() + "4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("5");
                }
                else {
                    textView.setText(textView.getText().toString() + "5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("6");
                }
                else {
                    textView.setText(textView.getText().toString() + "6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("7");
                }
                else {
                    textView.setText(textView.getText().toString() + "7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("8");
                }
                else {
                    textView.setText(textView.getText().toString() + "8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("9");
                }
                else {
                    textView.setText(textView.getText().toString() + "9");
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("0");
                }
                else {
                    textView.setText(textView.getText().toString() + "0");
                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("*");
                }
                else {
                    textView.setText(textView.getText().toString() + "*");
                }
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().contains(".")){
                    textView.setText("#");
                }
                else {
                    textView.setText(textView.getText().toString() + "#");
                }
            }
        });

        bdial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(speeddial1);
                makephonecall();
            }
        });

        bdial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(speeddial2);
                makephonecall();
            }
        });

        bdial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(speeddial3);
                makephonecall();
            }
        });

        bdial1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                try {
                    editSpeedDialDialog(speeddial1, speeddialname1, 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;

            }
        });

        bdial2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                try {
                    editSpeedDialDialog(speeddial2, speeddialname2, 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });

        bdial3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                try {
                    editSpeedDialDialog(speeddial3, speeddialname3, 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });

        bCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makephonecall();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView.getText().toString().length() > 0) {
                    StringBuilder sb = new StringBuilder(textView.getText());
                    sb.deleteCharAt(textView.getText().toString().length() - 1);
                    String newtv = sb.toString();
                    if (newtv.length() == 0) {
                        textView.setText("...");
                    }
                    else {
                        textView.setText(newtv);
                    }
                }

            }
        });

        imageButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                textView.setText("...");
                return true;
            }
        });

    }

    public void editSpeedDialDialog(String number, String name, int dial) throws InterruptedException {
        dialogBuilder = new AlertDialog.Builder(this);

        final View speedDialPopUp = getLayoutInflater().inflate(R.layout.popup, null);

        dialogBuilder.setView(speedDialPopUp);
        dialog = dialogBuilder.create();
        dialog.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                // Do nothing

            }
        }, 5000);

        speedcontact_firstname = (EditText) speedDialPopUp.findViewById(R.id.speedcontact_firstname);
        speedcontact_number = (EditText) speedDialPopUp.findViewById(R.id.speedcontact_number);
        speedCall = (Button) speedDialPopUp.findViewById(R.id.call);
        speedEdit = (Button) speedDialPopUp.findViewById(R.id.save);
        speedCancel = (Button) speedDialPopUp.findViewById(R.id.cancel);

        if (speedcontact_number!= null && speedcontact_firstname != null) {
            speedcontact_firstname.setText(name);
            speedcontact_number.setText(number);
        }

        if (speedEdit!= null) {
            speedEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (dial == 1) {
                        speeddialname1 = speedcontact_firstname.getText().toString();
                        speeddial1 = speedcontact_number.getText().toString();
                        bdial1.setText(speeddialname1);
                    }

                    if (dial == 2) {
                        speeddialname2 = speedcontact_firstname.getText().toString();
                        speeddial2 = speedcontact_number.getText().toString();
                        bdial2.setText(speeddialname2);
                    }

                    if (dial == 3) {
                        speeddialname3 = speedcontact_firstname.getText().toString();
                        speeddial3 = speedcontact_number.getText().toString();
                        bdial3.setText(speeddialname3);
                    }
                    dialog.dismiss();
                }
            });
        }

        if (speedCall != null) {
            speedCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText(newnumber);
                    makephonecall();
                    dialog.dismiss();
                }
            });
        }

        if (speedCancel != null) {
            speedCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
        }

    }

    private void makephonecall() {

        String numberToCall = textView.getText().toString();
        String dial = "tel:"+numberToCall;

        if (!dial.contains(".")) {
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }

    }

}