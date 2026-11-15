package p154p3;

import android.view.View;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.yoga.p;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0514a f47792a = C0514a.f47793a;

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name */
    public static final class C0514a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0514a f47793a = new C0514a();

        private C0514a() {
        }

        public final float a(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == 0) {
                return Float.POSITIVE_INFINITY;
            }
            return size;
        }

        public final float b(int i10) {
            return View.MeasureSpec.getMode(i10) == 1073741824 ? View.MeasureSpec.getSize(i10) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final p c(float f10, float f11) {
            if (f10 == f11) {
                return p.EXACTLY;
            }
            return Float.isInfinite(f11) ? p.UNDEFINED : p.AT_MOST;
        }

        public final float d(float f10, float f11) {
            if (f10 == f11) {
                return C1356f0.f15679a.b(f11);
            }
            if (Float.isInfinite(f11)) {
                return Float.POSITIVE_INFINITY;
            }
            return C1356f0.f15679a.b(f11);
        }
    }

    static float a(int i10) {
        return f47792a.b(i10);
    }

    static p b(float f10, float f11) {
        return f47792a.c(f10, f11);
    }

    static float c(int i10) {
        return f47792a.a(i10);
    }

    static float d(float f10, float f11) {
        return f47792a.d(f10, f11);
    }
}
