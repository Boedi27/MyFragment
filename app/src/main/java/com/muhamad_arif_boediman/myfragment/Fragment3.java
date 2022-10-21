package com.muhamad_arif_boediman.myfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    @Nullable
    @Override

    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        TextView textView = view.findViewById(R.id.textView);
        Button button = view.findViewById(R.id.button);
        ImageView imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(R.drawable.ic_3);
        textView.setText("Ini adalah fragment 3");
        button.setText("Click 3");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(requireActivity(), " Sekarang Anda Berada di Halaman Fragmen 3",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
