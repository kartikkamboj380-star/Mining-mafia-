package com.google.firebase.perf.session.gauges;

import X6.o;
import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final R6.a f40489e = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f40490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityManager f40491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f40492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f40493d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(X6.k.f6766f.d(this.f40492c.totalMem));
    }

    public int b() {
        return o.c(X6.k.f6766f.d(this.f40490a.maxMemory()));
    }

    public int c() {
        return o.c(X6.k.f6764d.d(this.f40491b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f40490a = runtime;
        this.f40493d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f40491b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f40492c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
