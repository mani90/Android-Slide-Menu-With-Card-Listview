package com.slidemenu.demo.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.slidemenu.demo.R;
import com.slidemenu.demo.model.CardViewModel;

public class CardviewArrayAdaper extends ArrayAdapter<CardViewModel> {
	private List<CardViewModel> list = new ArrayList<CardViewModel>();
	private Context context;
	
	static class CardViewHolder{
		TextView textView;
	}

	public CardviewArrayAdaper(Context context, int textViewResourceId) {
		super(context,  textViewResourceId);
		this.context = context;
		
	}
	
	public void add(CardViewModel model) {
		list.add(model);
		super.add(model);
	}
	
	@Override
	public int getCount() {
		return this.list.size();
	}
	
	public CardViewModel getItem(int index) {
		return this.list.get(index);
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		CardViewHolder holder;
		if(row == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.list_item_card, parent, false);
			holder = new CardViewHolder();
			holder.textView = (TextView) row.findViewById(R.id.line);
			row.setTag(holder);
		}else {
			holder = (CardViewHolder) row.getTag();
		}
		CardViewModel model = getItem(position);
		holder.textView.setText(model.getText());
		Animation animation = AnimationUtils.loadAnimation(context, R.anim.push_left_in);
		row.startAnimation(animation);
		return row;
		
	}	
}
