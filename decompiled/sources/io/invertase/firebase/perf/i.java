package io.invertase.firebase.perf;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f45220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.app.j f45222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Trace f45223d;

    public i(Activity activity, String str) {
        this.f45220a = activity;
        this.f45221b = str;
        if (!c(activity)) {
            throw new IllegalStateException("Device does not support screen traces. Hardware acceleration must be enabled and Android must not be 8.0 or 8.1.");
        }
        this.f45222c = new androidx.core.app.j();
    }

    private static boolean a() {
        return true;
    }

    private static boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 == 26 || i10 == 27) ? false : true;
    }

    private static boolean c(Activity activity) {
        boolean zB = b();
        boolean zA = a();
        boolean z9 = false;
        boolean z10 = (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
        if (zB && zA && z10) {
            z9 = true;
        }
        Log.d("RNFirebasePerf", "isValidSDKVersion: " + zB + "isScreenTraceSupported(" + activity + "): " + z9 + " [hasFrameMetricsAggregatorClass: " + zA + ", isActivityHardwareAccelerated: " + z10 + "]");
        return z9;
    }

    private String d() {
        return "_st_" + this.f45221b;
    }

    public void e() {
        Log.d("RNFirebasePerf", "Recording screen trace " + this.f45221b);
        this.f45222c.a(this.f45220a);
        this.f45223d = O6.e.h(d());
    }

    public void f() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (this.f45223d == null) {
            return;
        }
        SparseIntArray[] sparseIntArrayArrD = this.f45222c.d();
        int i12 = 0;
        if (sparseIntArrayArrD == null || (sparseIntArray = sparseIntArrayArrD[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        if (i12 > 0) {
            this.f45223d.putMetric(X6.b.FRAMES_TOTAL.toString(), i12);
        }
        if (i10 > 0) {
            this.f45223d.putMetric(X6.b.FRAMES_SLOW.toString(), i10);
        }
        if (i11 > 0) {
            this.f45223d.putMetric(X6.b.FRAMES_FROZEN.toString(), i11);
        }
        Log.d("RNFirebasePerf", "sendScreenTrace " + this.f45221b + ", name: " + d() + ", total_frames: " + i12 + ", slow_frames: " + i10 + ", frozen_frames: " + i11);
        this.f45223d.stop();
    }
}
