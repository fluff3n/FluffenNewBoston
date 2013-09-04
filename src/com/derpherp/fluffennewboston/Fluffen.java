package com.derpherp.fluffennewboston;

import android.R.color;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

public class Fluffen extends View {




	Bitmap bSquare;
	float changingY;
	Typeface font;
	public Fluffen(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		bSquare = BitmapFactory.decodeResource(getResources(), R.drawable.bluesquare);
		changingY = 0;
		font = Typeface.createFromAsset(context.getAssets(), "Roboto-Condensed.ttf");
	}

	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(color.background_light);
		
		Paint textPaint = new Paint();
		textPaint.setARGB(50, 244, 10, 50);
		textPaint.setTextAlign(Align.CENTER);
		textPaint.setTextSize(50);
		textPaint.setTypeface(font);
		canvas.drawText("fluffen", canvas.getWidth()/2, 200, textPaint);
		
		canvas.drawBitmap(bSquare, (canvas.getWidth()/2), changingY, null);
		if (changingY < canvas.getHeight()){
			changingY += 10;
		}else{
			changingY = 0;
		}
		Rect middleRect = new Rect();
		middleRect.set(0, 700, canvas.getWidth(), 770);
	
		Paint ourBlue = new Paint();
		ourBlue.setColor(Color.BLUE);
		canvas.drawRect(middleRect, ourBlue);
		invalidate();
	}
}
