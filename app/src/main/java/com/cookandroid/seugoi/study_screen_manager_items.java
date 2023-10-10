package com.cookandroid.seugoi;

import java.util.Calendar;

public class study_screen_manager_items {
    String txtStudyTitle, txtDay;

    public study_screen_manager_items(String txtStudyTitle, String txtDay) {
        this.txtStudyTitle = txtStudyTitle;
        this.txtDay = txtDay;
    }

    public String getTxtStudyTitle() {
        return txtStudyTitle;
    }

    public String getTxtDay() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return (year + "." + month + "." + day);
    }
}
