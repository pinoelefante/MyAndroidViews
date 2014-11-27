package it.pinoelefante.mycustomviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class PEditText extends EditText {

	public PEditText(Context context) {
		super(context);
	}

	public PEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public PEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	public void setSizePerc(int w, int h, String layoutName){
		int h_screen = getResources().getDisplayMetrics().heightPixels;
		int w_screen = getResources().getDisplayMetrics().widthPixels;
		
		int w_p=(w_screen/100)*w;
		int h_p=(h_screen/100)*h;
		if(getLayoutParams()==null){
			setLayoutParams(PLayoutParams.getLayout(layoutName, w_p, h_p));
		}
		getLayoutParams().height=h_p;;
		getLayoutParams().width=w_p;;
	}
}
