package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2697Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25647a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25648b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f25649c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25650d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25651e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25652f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25653g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25654h = -1;

    private static boolean l(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics m(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    public final void a() {
        this.f25648b = this.f25647a;
        this.f25647a = SystemClock.uptimeMillis();
    }

    public final void b(Context context, View view) {
        this.f25650d = this.f25649c;
        this.f25649c = SystemClock.uptimeMillis();
        long j10 = this.f25651e;
        if (j10 != -1) {
            this.f25652f = j10;
        }
        DisplayMetrics displayMetricsM = m(context);
        int i10 = displayMetricsM.widthPixels * displayMetricsM.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsM.widthPixels) * Math.min(view.getHeight(), displayMetricsM.heightPixels);
            if (iMin + iMin >= i10 || (iMin == 0 && l(view))) {
                this.f25651e = this.f25649c;
                return;
            }
        }
        this.f25651e = -1L;
    }

    public final void c() {
        this.f25654h = this.f25653g;
        this.f25653g = SystemClock.uptimeMillis();
    }

    public final long d() {
        return this.f25648b;
    }

    public final long e() {
        return this.f25647a;
    }

    public final long f() {
        return this.f25649c;
    }

    public final long g() {
        return this.f25650d;
    }

    public final long h() {
        return this.f25652f;
    }

    public final long i() {
        return this.f25651e;
    }

    public final long j() {
        return this.f25653g;
    }

    public final long k() {
        return this.f25654h;
    }
}
