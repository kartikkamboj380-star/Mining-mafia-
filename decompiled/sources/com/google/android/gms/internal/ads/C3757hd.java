package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3757hd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f29033e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29034a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29035b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29036c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29037d = false;

    C3757hd(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C3505fd(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static C3757hd a(Context context, Executor executor) {
        return new C3757hd(context, executor, f29033e);
    }

    public final void b() {
        if (this.f29037d) {
            this.f29035b = System.currentTimeMillis();
        }
    }

    public final long c() {
        if (this.f29037d) {
            return this.f29035b - this.f29034a;
        }
        return -1L;
    }

    public final long d() {
        long j10 = this.f29036c;
        this.f29036c = -1L;
        return j10;
    }

    final /* synthetic */ void e(long j10) {
        this.f29034a = j10;
    }

    final /* synthetic */ long f() {
        return this.f29035b;
    }

    final /* synthetic */ void g(long j10) {
        this.f29036c = j10;
    }

    final /* synthetic */ void h(boolean z9) {
        this.f29037d = z9;
    }
}
