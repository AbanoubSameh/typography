package in.workarounds.typography;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by madki on 13/10/15.
 */
public class AppCompatCheckBox extends android.support.v7.widget.AppCompatCheckBox {
    public AppCompatCheckBox(Context context) {
        super(context);
    }

    public AppCompatCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypography(attrs);
    }

    public AppCompatCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypography(attrs);
    }

    private void setTypography(AttributeSet attrs) {
        FontLoader.setTypography(this, attrs);
    }
}
