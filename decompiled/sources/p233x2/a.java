package p233x2;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: x2.a$a, reason: collision with other inner class name */
    public static class C0557a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50516b;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0557a c0557a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0557a.f50516b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0557a.f50515a) - i10) / f10) + i11), c0557a.f50516b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0557a.f50515a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0557a.f50516b) - i11) * f10) + i10), c0557a.f50515a), 1073741824);
        }
    }
}
