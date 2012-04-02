package nu.mine.tmyymmt.android.widget.retractivehorizontalscrollviewexample;

// import nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView;
import nu.mine.tmyymmt.android.widget.example.R;
import android.app.Activity;
import android.os.Bundle;

/**
 * Simple Example for Retractive Scroll Views for Android.
 * 
 * This is a example for
 * nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView.
 * 
 * @see nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView
 * 
 * @author Tomoya Yamamoto <a
 *         href="mailto:tmyymmt+github@gmail.com">&lt;tmyymmt+
 *         github@gmail.com&gt;</a> <a
 *         href="http://about.me/tmyymmt">http://about.me/tmyymmt</a>
 */
public class RetractiveHorizontalScrollViewExampleActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // If you want to change the retractive width then you can change it by
        // this way.
        // RetractiveHorizontalScrollView scrollView =
        // (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view);
        // scrollView.setRetractiveWidth(300);
    }
}
