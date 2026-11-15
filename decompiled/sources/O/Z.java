package O;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map f3784a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f3784a.containsKey(velocityTracker)) {
                f3784a.put(velocityTracker, new C0841a0());
            }
            ((C0841a0) f3784a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i10) {
        c(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        C0841a0 c0841a0E = e(velocityTracker);
        if (c0841a0E != null) {
            c0841a0E.c(i10, f10);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        C0841a0 c0841a0E = e(velocityTracker);
        return c0841a0E != null ? c0841a0E.d(i10) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private static C0841a0 e(VelocityTracker velocityTracker) {
        return (C0841a0) f3784a.get(velocityTracker);
    }
}
