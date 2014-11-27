package it.pinoelefante.mycustomviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class PLinearLayout extends LinearLayout {

	public PLinearLayout(Context context) {
		super(context);
	}

	public PLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public void setSizePerc(int w, int h){
		int h_screen = getResources().getDisplayMetrics().heightPixels;
		int w_screen = getResources().getDisplayMetrics().widthPixels;
		
		int w_p=(w_screen/100)*w;
		int h_p=(h_screen/100)*h;
		if(getLayoutParams()==null){
			setLayoutParams(new LayoutParams(w_p, h_p));
		}
		getLayoutParams().height=h_p;
		getLayoutParams().width=w_p;
		setMinimumHeight(h_p);
	}
	public void setSize(int w, int h){
		if(getLayoutParams()==null){
			setLayoutParams(new LayoutParams(w, h));
		}
		getLayoutParams().height=h;;
		getLayoutParams().width=w;;
	}
}
