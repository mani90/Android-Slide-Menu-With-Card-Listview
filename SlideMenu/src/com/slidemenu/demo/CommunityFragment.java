package com.slidemenu.demo;

import com.slidemenu.demo.adapter.CardviewArrayAdaper;
import com.slidemenu.demo.model.CardViewModel;

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

public class CommunityFragment extends Fragment {
	
	private ListView listView;
	private CardviewArrayAdaper arrayAdaper;
	public CommunityFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_community, container, false);
    	ActionBar androidad = getActivity().getActionBar();
        androidad.setDisplayHomeAsUpEnabled(true);
        
        listView = (ListView) rootView.findViewById(R.id.card_listview);
        listView.addHeaderView(new View(getActivity().getApplicationContext()));
        
        arrayAdaper = new CardviewArrayAdaper(getActivity(), R.layout.list_item_card);
        
        for(int i=0; i< 300; i++) {
        	CardViewModel model = new CardViewModel("List " + i);
        	arrayAdaper.add(model);
        }
        listView.setAdapter(arrayAdaper);
        
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,	long arg3) {
				Toast.makeText(getActivity(), " "+arg3, Toast.LENGTH_SHORT).show();
			
			}
		});
         
        return rootView;
    }
}
