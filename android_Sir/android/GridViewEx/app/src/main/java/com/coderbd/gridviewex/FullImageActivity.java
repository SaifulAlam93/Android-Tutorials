package com.coderbd.gridviewex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends Activity {
	ImageView imageView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.full_image);
		
		// get intent data
		Intent i = getIntent();
		
		// Selected image id
		int position = i.getExtras().getInt("id");
		ImageAdapter imageAdapter = new ImageAdapter(this);
		
		imageView = (ImageView) findViewById(R.id.full_image_view);
		imageView.setImageResource(imageAdapter.mThumbIds[position]);
	}

}
