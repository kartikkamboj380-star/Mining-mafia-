package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2570Vq0 implements InterfaceC2102Mq0, InterfaceC1573Cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5043rr0 f24569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f24570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1571Ck0 f24571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f24572e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.common.util.concurrent.p f24573f = AbstractC5685wx0.a(null);

    C2570Vq0(Context context, C5043rr0 c5043rr0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, C1571Ck0 c1571Ck0) {
        this.f24568a = context;
        this.f24569b = c5043rr0;
        this.f24570c = interfaceExecutorServiceC1805Gx0;
        this.f24571d = c1571Ck0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void a(Map map) {
        map.put("gs", this.f24573f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void b(Map map) {
        map.put("gs", this.f24573f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void c(Map map, Context context, View view) {
        map.put("gs", this.f24573f);
    }

    final /* synthetic */ void d() {
        com.google.common.util.concurrent.p pVarE0 = this.f24570c.e0(new Callable() { // from class: com.google.android.gms.internal.ads.Tq0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f23621a.e();
            }
        });
        this.f24569b.e(53, pVarE0);
        this.f24573f = pVarE0;
    }

    final /* synthetic */ C4255lb e() {
        Context context = this.f24568a;
        try {
            return AbstractC2084Mh0.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        return (this.f24572e.getAndSet(true) || !this.f24571d.l0()) ? AbstractC5685wx0.b() : this.f24570c.j0(new Runnable() { // from class: com.google.android.gms.internal.ads.Uq0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f24108a.d();
            }
        });
    }
}
