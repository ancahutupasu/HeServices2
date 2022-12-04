package com.example.heservices.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import com.example.heservices.R;


public class AboutFragment extends Fragment {

    private AboutViewModel mViewModel;

    //  TextView about;
    //  TextView main_text;
    //  TextView textView2;
    // TextView start;
    // TextView located;
    //  ImageView imageView3;
    // Button floating;
    // View view;

    // public static AboutFragment newInstance() {
    //    return new AboutFragment();
    //  }

      public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, container, false);

    //    about = view.findViewById(R.id.about);
    //    main_text = view.findViewById(R.id.main_text);
    //    textView2 = view.findViewById(R.id.textView2);
    //    start = view.findViewById(R.id.start);
    //    located = view.findViewById(R.id.located);
    //    imageView3 = view.findViewById(R.id.imageView3);
    //    floating = view.findViewById(R.id.floating);

    //   return view;
    //   }

    //   @Override
    //public void onActivityCreated(@Nullable Bundle saveInstanceState) {
    //      super.onActivityCreated(saveInstanceState);
    //     mViewModel = new ViewModelProvider(this).get(AboutViewModel.class);

    //    floating.setOnClickListener(new View.OnClickListener() {
    //       @Override
    //       public void onClick(View view) {

    //           getSupportFragmentManager().beginTransaction().replace(R.id., fragment_signin).commit();
    //        }
    //    });
//    }

    //   private FragmentManager getSupportFragmentManager() {
    //   }
}
}

//private Fragment fragment_signin;
