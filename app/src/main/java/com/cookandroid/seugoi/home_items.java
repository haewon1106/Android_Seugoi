package com.cookandroid.seugoi;

//public class home_items {
//    String yourName, studyName;
//
//    public home_items(String yourName, String studyName) {
//        this.yourName = yourName;
//        this.studyName = studyName;
//    }
//
//    public String getYourName() {
//        return yourName;
//    }
//
//    public String getStudyName() {
//        return studyName;
//    }
//}

import java.util.Calendar;

public class home_items {
    private String studyName;
    private String hashTag;
    private String txtDay;

    public home_items(String studyName, String hashTag, String txtDay) {
        this.studyName = studyName;
        this.hashTag = hashTag;
        this.txtDay = txtDay;
    }

    public String getStudyName() {
        return studyName;
    }

    public String getHashTag() {
        return hashTag;
    }

    public String getTxtDay() {
        return txtDay;
    }
}