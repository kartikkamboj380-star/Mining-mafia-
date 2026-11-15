package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3534fr0 implements InterfaceC2102Mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28493a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28494b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28495c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28496d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f28497e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28498f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f28499g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28500h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f28501i = SystemClock.uptimeMillis();

    public C3534fr0(C4148kk0 c4148kk0) {
    }

    private static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics e(Context context) {
        WindowManager windowManager;
        if ((Build.VERSION.SDK_INT >= 33 && !context.isUiContext()) || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    private final void f(Map map) {
        map.put("tcq", Long.valueOf(this.f28493a));
        map.put("tpq", Long.valueOf(this.f28494b));
        map.put("tcc", Long.valueOf(this.f28499g));
        map.put("tpc", Long.valueOf(this.f28500h));
        map.put("tpv", Long.valueOf(this.f28496d));
        map.put("tcv", Long.valueOf(this.f28495c));
        map.put("tchv", Long.valueOf(this.f28497e));
        map.put("tphv", Long.valueOf(this.f28498f));
        map.put("tst", Long.valueOf(this.f28501i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final synchronized void a(Map map) {
        this.f28500h = this.f28499g;
        this.f28499g = SystemClock.uptimeMillis();
        f(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final synchronized void b(Map map) {
        this.f28494b = this.f28493a;
        this.f28493a = SystemClock.uptimeMillis();
        f(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final synchronized void c(Map map, Context context, View view) {
        try {
            this.f28496d = this.f28495c;
            this.f28495c = SystemClock.uptimeMillis();
            long j10 = this.f28497e;
            if (j10 != -1) {
                this.f28498f = j10;
            }
            DisplayMetrics displayMetricsE = e(context);
            if (displayMetricsE != null) {
                int i10 = displayMetricsE.widthPixels * displayMetricsE.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetricsE.widthPixels) * Math.min(view.getHeight(), displayMetricsE.heightPixels);
                    if (iMin + iMin >= i10 || (iMin == 0 && d(view))) {
                        this.f28497e = this.f28495c;
                    }
                }
                f(map);
            }
            this.f28497e = -1L;
            f(map);
        } catch (Throwable th) {
            throw th;
        }
    }
}
