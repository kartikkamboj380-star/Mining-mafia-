package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4540nr0 implements InterfaceC2102Mq0, InterfaceC1573Cl0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String[] f31892h = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f31894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f31895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f31896d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31897e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f31898f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31899g = false;

    C4540nr0(Context context, C4148kk0 c4148kk0, ExecutorService executorService, String[] strArr) {
        this.f31893a = context;
        this.f31894b = executorService;
        this.f31895c = strArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void a(Map map) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void b(Map map) {
        long j10;
        long j11;
        d();
        synchronized (this) {
            try {
                j10 = this.f31899g ? this.f31897e - this.f31896d : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.f31898f;
            this.f31898f = -1L;
        }
        map.put("vf", Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void c(Map map, Context context, View view) {
        d();
    }

    final void d() {
        synchronized (this) {
            try {
                if (this.f31899g) {
                    this.f31897e = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void e() {
        C4162kr0 c4162kr0 = new C4162kr0(this);
        try {
            Object systemService = this.f31893a.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.f31895c, this.f31894b, c4162kr0);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void f(long j10) {
        this.f31896d = j10;
    }

    final /* synthetic */ long g() {
        return this.f31897e;
    }

    final /* synthetic */ void h(long j10) {
        this.f31898f = j10;
    }

    final /* synthetic */ void i(boolean z9) {
        this.f31899g = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        return Build.VERSION.SDK_INT < 30 ? AbstractC5685wx0.b() : AbstractC5685wx0.e(new Runnable() { // from class: com.google.android.gms.internal.ads.lr0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f31371a.e();
            }
        }, this.f31894b);
    }
}
