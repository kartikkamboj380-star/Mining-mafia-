package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4278lm0 implements InterfaceC2508Ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f31349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2978bQ0 f31350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2978bQ0 f31351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1947Jq0 f31352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2978bQ0 f31353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5493vQ0 f31354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1571Ck0 f31355g;

    C4278lm0(ExecutorService executorService, InterfaceC2978bQ0 interfaceC2978bQ0, InterfaceC2978bQ0 interfaceC2978bQ1, C1947Jq0 c1947Jq0, InterfaceC2978bQ0 interfaceC2978bQ2, InterfaceC5493vQ0 interfaceC5493vQ0, C1571Ck0 c1571Ck0) {
        this.f31349a = executorService;
        this.f31350b = interfaceC2978bQ0;
        this.f31351c = interfaceC2978bQ1;
        this.f31352d = c1947Jq0;
        this.f31353e = interfaceC2978bQ2;
        this.f31354f = interfaceC5493vQ0;
        this.f31355g = c1571Ck0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p a(Context context, String str, View view, Activity activity) {
        InterfaceC1575Cm0 interfaceC1575Cm0B = ((InterfaceC1575Cm0) this.f31354f.zzb()).b(context);
        interfaceC1575Cm0B.f(view);
        interfaceC1575Cm0B.e(activity);
        interfaceC1575Cm0B.k(true != this.f31355g.n0() ? "" : null);
        interfaceC1575Cm0B.a(this.f31352d.c(context, view));
        interfaceC1575Cm0B.c(C4255lb.g1());
        interfaceC1575Cm0B.d(EnumC2894al0.VIEW);
        return interfaceC1575Cm0B.zza().zza().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p b(Context context, String str, View view, Activity activity) {
        InterfaceC2978bQ0 interfaceC2978bQ0 = this.f31353e;
        Map mapD = this.f31352d.d();
        ((C5285tm0) interfaceC2978bQ0.zzb()).b(mapD);
        InterfaceC1575Cm0 interfaceC1575Cm0B = ((InterfaceC1575Cm0) this.f31354f.zzb()).b(context);
        interfaceC1575Cm0B.f(view);
        interfaceC1575Cm0B.e(null);
        interfaceC1575Cm0B.k(str);
        interfaceC1575Cm0B.a(mapD);
        interfaceC1575Cm0B.d(EnumC2894al0.CLICK);
        interfaceC1575Cm0B.c(C4255lb.g1());
        return interfaceC1575Cm0B.zza().zza().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final void c(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((C5285tm0) this.f31353e.zzb()).a((MotionEvent) inputEvent);
        }
    }

    final /* synthetic */ Void d() {
        ((C1731Fm0) this.f31351c.zzb()).a();
        ((InterfaceC2718Ym0) this.f31350b.zzb()).zza();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p e(Context context) {
        InterfaceC1575Cm0 interfaceC1575Cm0B = ((InterfaceC1575Cm0) this.f31354f.zzb()).b(context);
        interfaceC1575Cm0B.a(this.f31352d.b());
        interfaceC1575Cm0B.c(C4255lb.g1());
        interfaceC1575Cm0B.d(EnumC2894al0.QUERY);
        return interfaceC1575Cm0B.zza().zza().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final String zza() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p zzb() {
        return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.km0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f30879a.d();
                return null;
            }
        }, this.f31349a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final int zzg() {
        return 2;
    }
}
