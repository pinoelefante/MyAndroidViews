package it.pinoelefante.mycustomviews;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PLayoutParams {
	public static final String LINEARLAYOUT="linear", RELATIVELAYOUT="relative";
	
	public static ViewGroup.LayoutParams getLayout(String l, int w, int h){
		switch(l){
			case LINEARLAYOUT:
				return new LinearLayout.LayoutParams(w,h);
			case RELATIVELAYOUT:
				return new RelativeLayout.LayoutParams(w,h);
		}
		return new ViewGroup.LayoutParams(w,h);
	}

}
