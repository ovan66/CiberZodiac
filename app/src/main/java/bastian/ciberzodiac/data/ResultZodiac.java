package bastian.ciberzodiac.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import bastian.ciberzodiac.R;

/**
 * Created by Bastian on 28-10-2016.
 */

public class ResultZodiac extends AnswerZodiac{

    public ResultZodiac(String name, String date, Context context) {
        super(name, date, context);
    }

    public String result(){
        if (nameSearcher().equals("no name")){
            return "Escribe un nombre";
        }else if (dateComparation().equals("no date")){
            return "Selecciona una fecha de nacimiento";
        }else if ((nameSearcher().equals("no name"))&&(dateComparation().equals("no date"))){
            return "Escribe un nombre y Selecciona una fecha de nacimiento";
        }
        else
        { return nameSearcher() + " tu signo es " +dateComparation();}
    }

    private String nameSearcher(){
        String name = getName().toString();
        if (name.trim().length() > 0) {
            return name;
        }else{
            return "no name";
    }}

    private String dateComparation(){
        List <String> dates = new ArrayList<>();
        dates.add(getContext().getString(R.string.Aries));
        dates.add(getContext().getString(R.string.Tauro));
        dates.add(getContext().getString(R.string.Géminis));
        dates.add(getContext().getString(R.string.Cáncer));
        dates.add(getContext().getString(R.string.Leo));
        dates.add(getContext().getString(R.string.Virgo));
        dates.add(getContext().getString(R.string.Libra));
        dates.add(getContext().getString(R.string.Escorpio));
        dates.add(getContext().getString(R.string.Sagitario));
        dates.add(getContext().getString(R.string.Capricornio));
        dates.add(getContext().getString(R.string.Acuario));
        dates.add(getContext().getString(R.string.Piscis));

        int matcher = 0;
        for (int i = 0; i < dates.size(); i++) {
            String date = dates.get(i);
            if (getDate().equals(date)) {
                matcher = i;
            }
        }
        if (matcher == 1){
            return "Aries";}

        else if (matcher == 2){
            return "Tauro";}

        else if (matcher == 3){
            return "Géminis";}

        else if (matcher == 4){
            return "Cáncer";}

        else if (matcher == 5){
            return "Leo";}

        else if (matcher == 6){
            return "Virgo";}

        else if (matcher == 7){
            return "Libra";}

        else if (matcher == 8){
            return "Escorpio";}

        else if (matcher == 9){
            return "Sagitario";}

        else if (matcher == 10){
            return "Capricornio";}

        else if (matcher == 11){
            return "Acuario";}

        else if (matcher == 12){
            return "Piscis";}
        else {
            return "no date";
        }
    }
}
