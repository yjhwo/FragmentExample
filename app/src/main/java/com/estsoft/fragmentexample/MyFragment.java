package com.estsoft.fragmentexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText("Hello Fragment");
//        return textView;

        View rootView = inflater.inflate( R.layout.layout_myfragment, container, false );
        rootView.findViewById( R.id.button ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().
                        getSupportFragmentManager().
                        beginTransaction().replace( android.R.id.content, new MyFragment2()).
                        commit();
                // fragment에는 부모 Activity를 찾아주는 getActivity() method가 있다.
                // android.R.id.content : Activity에 있는 Root View
            }
        });
        return rootView;
    }

}
