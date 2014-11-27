package it.pinoelefante.mycustomviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class PRelativeLayout extends RelativeLayout {

	public PRelativeLayout(Context context) {
		super(context);
	}

	public PRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public PRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	public void setSizePerc(int w, int h){
		int h_screen = getResources().getDisplayMetrics().heightPixels;
		int w_screen = getResources().getDisplayMetrics().widthPixels;
		
		int w_p=(w_screen/100)*w;
		int h_p=(h_screen/100)*h;
		if(getLayoutParams()==null){
			setLayoutParams(new LayoutParams(w_p, h_p));
		}
		getLayoutParams().height=h_p;;
		getLayoutParams().width=w_p;;
	}
	public void setSize(int w, int h){
		if(getLayoutParams()==null){
			setLayoutParams(new LayoutParams(w, h));
		}
		getLayoutParams().height=h;;
		getLayoutParams().width=w;;
	}
	public void setWidth(int w){
		if(getLayoutParams()==null){
			setLayoutParams(new LayoutParams(w, LayoutParams.WRAP_CONTENT));
		}
		getLayoutParams().width=w;
	}
	public void setHeight(int h){
		if(getLayoutParams()==null){
			setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, h));
		}
		getLayoutParams().height=h;
	}
}
