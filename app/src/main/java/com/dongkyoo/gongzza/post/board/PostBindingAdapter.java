package com.dongkyoo.gongzza.post.board;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.dongkyoo.gongzza.R;
import com.dongkyoo.gongzza.vos.Post;

import java.util.Calendar;

public class PostBindingAdapter {
    @BindingAdapter("post_startAt")
    public static void startAt(TextView textView, Post post) {
        String[] dayList = textView.getContext().getResources().getStringArray(R.array.day_list);
        StringBuffer sb = new StringBuffer();
        Calendar c = Calendar.getInstance();
        c.setTime(post.getStartAt());

        sb.append(dayList[c.get(Calendar.DAY_OF_WEEK)]).append(" ")
                .append(c.get(Calendar.HOUR))
                .append("시");
        textView.setText(sb.toString());
    }

    @BindingAdapter("post_num_of_participants")
    public static void numOfParticipants(TextView textView, Post post) {
        textView.setText(post.getCurrentNumOfParticipants() + "명 / " + post.getTotalNumOfParticipants() + "명");
    }
}