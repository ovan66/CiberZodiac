package bastian.ciberzodiac.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import bastian.ciberzodiac.R;
import bastian.ciberzodiac.data.ResultZodiac;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZodiacFragment extends Fragment {

    private EditText nameEt;
    private RadioGroup radioGroup;

    public ZodiacFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_zodiac, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nameEt = (EditText) view.findViewById(R.id.nameEt);
        radioGroup = (RadioGroup) view.findViewById(R.id.dateRg);

        Button buton = (Button) view.findViewById(R.id.ResultBtn);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                int radioBtn = radioGroup.getCheckedRadioButtonId();
                String date = "";
                if (radioBtn != -1);
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioBtn);
                date = radioButton.getText().toString();
                ResultZodiac resultZodiac = new ResultZodiac(name,date, getContext());
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage(ResultZodiac.result());
                dialog.show();

            }
        })
    }
}
