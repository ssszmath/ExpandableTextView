package ir.s.s.expandabletextview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by win on 04/08/2018.
 */

public class MyView extends RelativeLayout {



    public TextView textView;



    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    public MyView(Context context,AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(final Context context){
      View view =inflate(context, R.layout.my_view, this);

         textView=(TextView) view.findViewById(R.id.textview);
        final ImageView imageView=(ImageView) view.findViewById(R.id.imageview);





        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView.getMaxLines()>2){
                    textView.setMaxLines(2);
                    imageView.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);


                }else {
                    textView.setMaxLines(50);
                    imageView.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);

                }

            }
        });


    }

    public void setTextView(String text){
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
        textView.setText(text);
    }


}
