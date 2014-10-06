package it.pinoelefante.mycustomviews;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;


public class PButton extends Button {

	public PButton(Context context) {
		super(context);
	}

	public PButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public PButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
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
}
