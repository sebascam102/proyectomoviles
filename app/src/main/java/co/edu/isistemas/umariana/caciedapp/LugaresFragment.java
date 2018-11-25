package co.edu.isistemas.umariana.caciedapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LugaresFragment extends Fragment {


    public LugaresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_lugares, container, false);

       // WebView lugar_udenar=(WebView)view.findViewById(R.id.lugares_udenar);
       // lugar_udenar.loadData(getResources().getString(R.string.udenar), "text/html","utf-8");
        //lugar_udenar.setBackgroundColor(Color.TRANSPARENT);

       // WebView lugar_umariana=(WebView)view.findViewById(R.id.lugares_umariana);
        //lugar_umariana.loadData(getResources().getString(R.string.umariana), "text/html","utf-8");
        //lugar_umariana.setBackgroundColor(Color.TRANSPARENT);

        //WebView lugar_cesmag=(WebView)view.findViewById(R.id.lugares_cesmag);
        //lugar_cesmag.loadData(getResources().getString(R.string.cesmag), "text/html","utf-8");
        //lugar_cesmag.setBackgroundColor(Color.TRANSPARENT);
        return view;
    }

}
