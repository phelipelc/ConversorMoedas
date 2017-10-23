package br.com.phelipe.mobile.conversormoedas;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private ViewHolder mviewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mviewHolder.editValue = (EditText) findViewById(R.id.edit_value);
        this.mviewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.mviewHolder.texteuro = (TextView) findViewById(R.id.text_euro);
        this.mviewHolder.buttonCalculate = (Button) findViewById(R.id.button_calculate);
        this.mviewHolder.buttonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View view) {
    int id= view.getId();
        if(id==R.id.button_calculate){
            Double value = Double.valueOf(this.mviewHolder.editValue.getText().toString());
            this.mviewHolder.textDollar.setText(String.format("%.2f",value  * 3));
            this.mviewHolder.texteuro.setText(String.format("%.2f",value * 4));

        }
    }
    private void clearValues() {
        this.mviewHolder.textDollar.setText(" ");
        this.mviewHolder.texteuro.setText(" ");
    }


    private static class ViewHolder{
    TextView textDollar;
    TextView texteuro;
    Button buttonCalculate;
    EditText editValue;
    }

}
