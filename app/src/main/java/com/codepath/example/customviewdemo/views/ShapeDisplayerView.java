package com.codepath.example.customviewdemo.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ShapeDisplayerView extends View {
	private int shapeWidth = 100;
	private int shapeHeight = 100;
	private Paint paintShape;

	public ShapeDisplayerView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setupPaint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// Draw square
		canvas.drawRect(0, 0, shapeWidth, shapeHeight, paintShape);
		// Draw circle
		paintShape.setColor(Color.MAGENTA);
		canvas.drawCircle(shapeWidth + (shapeWidth / 2) + 10, shapeHeight / 2, shapeWidth / 2, paintShape);
		// Draw rounded rect
		paintShape.setColor(Color.GRAY);
		canvas.drawRoundRect(getRoundedRect(), 10, 10, paintShape);
	}
	
	protected RectF getRoundedRect() {
		int xPos = (shapeWidth + 10) * 2;
		return new RectF(xPos, 0, xPos + shapeWidth, shapeHeight);
	}
	
	// Define width and height to be the proper min dimensions
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int width = resolveSizeAndState((shapeWidth + 10) * 3, widthMeasureSpec, 0);
		int height = resolveSizeAndState(shapeHeight, heightMeasureSpec, 0);
		setMeasuredDimension(width, height);
	}

	private void setupPaint() {
		paintShape = new Paint();
		paintShape.setStyle(Style.FILL);
		paintShape.setColor(Color.BLUE);
		paintShape.setTextSize(30);
	}
}
