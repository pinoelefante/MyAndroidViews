package it.pinoelefante.mycustomviews;

import android.view.ViewGroup;

public class PLayoutParams {
	public static final String LINEARLAYOUT="linear", RELATIVELAYOUT="relative";
	
	public static ViewGroup.LayoutParams getLayout(String l, int w, int h){
		switch(l){
			case LINEARLAYOUT:
				return new PLinearLayout.LayoutParams(w,h);
			case RELATIVELAYOUT:
				return new PRelativeLayout.LayoutParams(w,h);
		}
		return new ViewGroup.LayoutParams(w,h);
	}

}
