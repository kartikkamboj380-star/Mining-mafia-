package J4;

import K4.C0794u;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
final class s extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0794u f2291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f2292b;

    public s(Context context, String str, String str2, String str3) {
        super(context);
        C0794u c0794u = new C0794u(context, str);
        this.f2291a = c0794u;
        c0794u.d(str2);
        c0794u.c(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2292b) {
            return false;
        }
        this.f2291a.a(motionEvent);
        return false;
    }
}
