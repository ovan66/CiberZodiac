package bastian.ciberzodiac.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import bastian.ciberzodiac.R;
import bastian.ciberzodiac.data.ResultZodiac;

import static android.R.attr.name;

public class ZodiacActivity extends AppCompatActivity {

    private TextInputEditText nameEt;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);

        nameEt = (TextInputEditText) findViewById(R.id.nameEt);
        radioGroup = (RadioGroup) findViewById(R.id.dateRg);

        Button button= (Button) findViewById(R.id.ResultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                int radioBtn = radioGroup.getCheckedRadioButtonId();
                String date = "";
                if (radioBtn != -1);
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioBtn);
                date = radioButton.getText().toString();
                ResultZodiac resultZodiac = new ResultZodiac(name,date,getBaseContext());
                AlertDialog.Builder dialog = new AlertDialog.Builder(getBaseContext());
                dialog.setMessage(resultZodiac.result());
                dialog.show();
            }
        });
    }
}