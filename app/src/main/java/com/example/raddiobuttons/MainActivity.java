package com.example.raddiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private View particular;
    private View corporativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        particular = findViewById(R.id.ll_particular);
        corporativo = findViewById(R.id.ll_corporativo);
    }

    public void  onRadioButtonClicked(View v)
    {
        boolean marcado = ((RadioButton)v).isChecked();
        switch (v.getId())
        {
            case R.id.rb_corporativo:
                if(marcado)
                    mostrarParticular(false);
                break;
            case R.id.rb_particular:
                if(marcado)
                    mostrarParticular(true);
                break;
        }
    }

    private void mostrarParticular(boolean b)
    {
        particular.setVisibility(b ? View.VISIBLE : View.GONE);
        corporativo.setVisibility(b ? View.GONE : View.VISIBLE);
    }

}
