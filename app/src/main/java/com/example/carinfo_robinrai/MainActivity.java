package com.example.carinfo_robinrai;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private TextView txtScrollable;
private EditText txtMake,txtYear,txtColor,txtPurchasePrice,txtEngineSize;
private Button btnCreateCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }

    private void initItems(){

        txtMake = findViewById(R.id.TxtMake);
        txtYear = findViewById(R.id.TxtYear);
        txtColor = findViewById(R.id.TxtColor);
        txtPurchasePrice = findViewById(R.id.TxtPrice);
        txtEngineSize = findViewById(R.id.TxtEngineSize);
        txtScrollable = findViewById(R.id.TxtScroll);
        txtScrollable.setMovementMethod(new ScrollingMovementMethod());
        btnCreateCar = findViewById(R.id.BtnCreateCar);
        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAction();
            }
        });

    }
    private void performAction(){

        String data = "\r\n" +"Make:"+txtMake.getText().toString()+"."+"\r\n"+ "Year:"+txtYear.getText().toString()
                +"."+"\r\n"+ "Color:"+txtColor.getText().toString()+"."+"\r\n"
                + "Purchase Price:"+txtPurchasePrice.getText().toString()
                +"."+"\r\n"+ "Engine Size:"+txtEngineSize.getText().toString();
                txtScrollable.setText(txtScrollable.getText().toString()+"\r\n"+data);

    }
}