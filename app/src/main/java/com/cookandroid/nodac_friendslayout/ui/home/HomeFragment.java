package com.cookandroid.nodac_friendslayout.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import androidx.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.cookandroid.nodac_friendslayout.R;
import com.cookandroid.nodac_friendslayout.databinding.FragmentHomeBinding;
import com.cookandroid.nodac_friendslayout.databinding.FragmentSlideshowBinding;
//import com.cookandroid.nodac_friendslayout.ui.slideshow.SlideshowViewModel;

public class HomeFragment extends Fragment {



    private FragmentHomeBinding binding;
    public CalendarView calendarView;
    public Button del_Btn,save_Btn;
    public TextView diaryTextView,textView2;
    public EditText contextEditText, fEditText;
    public ImageView imgv;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        //SlideshowViewModel slideshowViewModel =
        //       new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        save_Btn = (Button)v.findViewById(R.id.save_Btn) ;
        del_Btn = (Button)v.findViewById(R.id.del_Btn) ;
        diaryTextView = (TextView)v.findViewById(R.id.diaryTextView);
        contextEditText = (EditText) v.findViewById(R.id.contextEditText);
        textView2 = (TextView)v.findViewById(R.id.textView2);
        imgv = (ImageView)v.findViewById(R.id.imgv);
        fEditText = (EditText) v.findViewById(R.id.fEditText);


        calendarView=v.findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                diaryTextView.setVisibility(View.VISIBLE);
                imgv.setVisibility(View.VISIBLE);
                contextEditText.setVisibility(View.VISIBLE);
                save_Btn.setVisibility(View.VISIBLE);
                del_Btn.setVisibility(View.VISIBLE);
                fEditText.setVisibility(View.VISIBLE);
            }
        });



        //final TextView textView = binding.textHome;
        //slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }

    //기존코드
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}