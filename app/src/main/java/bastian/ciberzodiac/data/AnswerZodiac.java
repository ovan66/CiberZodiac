package bastian.ciberzodiac.data;

import android.content.Context;

/**
 * Created by Bastian on 28-10-2016.
 */

public class AnswerZodiac {

    private String name, date;
    private Context context;

    public AnswerZodiac(String name, String date, Context context) {
        this.name = name;
        this.date = date;
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public Context getContext() {
        return context;
    }

    public String getDate() {
        return date;
    }
}
