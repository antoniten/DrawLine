package ru.pavlenty.canvasexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button color;
    private Button width;
    private Button deletion;


    private CanvasView customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCanvas = (CanvasView) findViewById(R.id.signature_canvas);

        color = (Button) findViewById(R.id.button2);
        width = (Button) findViewById(R.id.button);
        deletion = (Button) findViewById(R.id.button3);
        color.setOnClickListener(this);
        width.setOnClickListener(this);
        deletion.setOnClickListener(this);

    }

    public void clearCanvas(View v) {
        customCanvas.clearCanvas();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                customCanvas.mPaint.setStrokeWidth(20);
                break;

            case R.id.button2:
                customCanvas.mPaint.setColor(Color.RED);
                break;
            case R.id.button3:
                customCanvas.mPaint.setColor(Color.BLACK);
                customCanvas.mPaint.setStrokeWidth(4f);
                break;
        }
    }
}

