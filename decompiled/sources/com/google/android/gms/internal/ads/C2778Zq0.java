package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2778Zq0 implements InterfaceC2102Mq0, InterfaceC1573Cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f26324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkCapabilities f26325c = null;

    C2778Zq0(Context context, ExecutorService executorService) {
        this.f26323a = context;
        this.f26324b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void a(Map map) {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void b(Map map) {
        NetworkCapabilities networkCapabilities;
        long j10;
        synchronized (this) {
            networkCapabilities = this.f26325c;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f26325c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j10 = 2;
                    } else if (this.f26325c.hasTransport(1)) {
                        j10 = 1;
                    } else {
                        j10 = this.f26325c.hasTransport(0) ? 0L : -1L;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("nt", Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void c(Map map, Context context, View view) {
    }

    final /* synthetic */ void d() {
        C2674Xq0 c2674Xq0 = new C2674Xq0(this);
        try {
            Object systemService = this.f26323a.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c2674Xq0);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void e(NetworkCapabilities networkCapabilities) {
        this.f26325c = networkCapabilities;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.e(new Runnable() { // from class: com.google.android.gms.internal.ads.Yq0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25779a.d();
            }
        }, this.f26324b);
    }
}
