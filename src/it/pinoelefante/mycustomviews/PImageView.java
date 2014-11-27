package it.pinoelefante.mycustomviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class PImageView extends ImageView {
	private String layoutName;
	
	public PImageView(Context context) {
		super(context);
	}
	
	public PImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public PImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void setSizePerc(int w, int h, String layoutName){
		this.layoutName=layoutName;
		int h_screen = getResources().getDisplayMetrics().heightPixels;
		int w_screen = getResources().getDisplayMetrics().widthPixels;
		
		int w_p=(w_screen/100)*w;
		int h_p=(h_screen/100)*h;
		
		if(getLayoutParams()==null){
			setLayoutParams(PLayoutParams.getLayout(layoutName, w_p, h_p));
		}
		getLayoutParams().height=h_p;
		getLayoutParams().width=w_p;
	}
	public void setSize(int w, int h){
		if(getLayoutParams()==null){
			setLayoutParams(PLayoutParams.getLayout(layoutName, w, h));
		}
		getLayoutParams().height=h;
		getLayoutParams().width=w;
	}
	public void setSizePercH(int dim, String layoutName){
		setSizePerc(calculateH(dim), calculateH(dim), layoutName);
	}
	private int calculateH(int perc){
		int h_screen = getResources().getDisplayMetrics().heightPixels;
		return (h_screen/100)*perc;
	}
	private int calculateW(int perc){
		int w_screen = getResources().getDisplayMetrics().widthPixels;
		return (w_screen/100)*perc;
	}
}
