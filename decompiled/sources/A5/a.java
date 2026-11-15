package A5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dialog f46a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49d;

    public a(Dialog dialog, Rect rect) {
        this.f46a = dialog;
        this.f47b = rect.left;
        this.f48c = rect.top;
        this.f49d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f47b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f48c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f49d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f46a.onTouchEvent(motionEventObtain);
    }
}
