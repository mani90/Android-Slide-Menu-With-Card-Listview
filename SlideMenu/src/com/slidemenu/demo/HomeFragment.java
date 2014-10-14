package com.slidemenu.demo;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.slidemenu.demo.adapter.CardviewArrayAdaper;
import com.slidemenu.demo.model.CardViewModel;

public class HomeFragment extends Fragment {
	
	 View rootView;
	 private String[] values;
	 private ListView listView;
	 private CardviewArrayAdaper arrayAdaper;
	 

public HomeFragment(){}


	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		 View rootView = inflater.inflate(R.layout.fragment_home, container, false);
 
		ActionBar androidad = getActivity().getActionBar();
        androidad.setDisplayHomeAsUpEnabled(true);
        
        listView = (ListView) rootView.findViewById(R.id.card_listview);
        listView.addHeaderView(new View(getActivity().getApplicationContext()));
        arrayAdaper = new CardviewArrayAdaper(getActivity(), R.layout.list_item_card);
        values = new String[] { "Android List View", 
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "List View Array Adapter", 
                "Android Example List View" ,
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter",
                "Android Example List View" 
               };
       for(int i=0; i< values.length; i++) {
			CardViewModel model = new CardViewModel(values[i]);
			arrayAdaper.add(model);
       }
       
       listView.setAdapter(arrayAdaper);
       
       listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int position,	long id) {
				Toast.makeText(getActivity(),""+values[position-1], Toast.LENGTH_SHORT).show();
			}
		});
      
        return rootView;
    }
}
