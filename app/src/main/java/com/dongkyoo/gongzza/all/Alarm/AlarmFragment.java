package com.dongkyoo.gongzza.all.BreakTime;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import androidx.fragment.app.Fragment;

        import com.dongkyoo.gongzza.R;

public class AlarmFragment extends Fragment {

    public AlarmFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);
        return view;
    }
}
