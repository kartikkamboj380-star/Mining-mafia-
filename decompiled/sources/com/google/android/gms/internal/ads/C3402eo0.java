package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3402eo0 implements InterfaceC2508Ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2978bQ0 f28069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2978bQ0 f28070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2978bQ0 f28071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28073e;

    C3402eo0(InterfaceC2978bQ0 interfaceC2978bQ0, InterfaceC2978bQ0 interfaceC2978bQ1, InterfaceC2978bQ0 interfaceC2978bQ2, boolean z9, long j10) {
        this.f28069a = interfaceC2978bQ0;
        this.f28070b = interfaceC2978bQ1;
        this.f28071c = interfaceC2978bQ2;
        this.f28072d = z9;
        this.f28073e = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p a(Context context, String str, View view, Activity activity) {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).a(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p b(Context context, String str, View view, Activity activity) {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).b(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final void c(InputEvent inputEvent) {
        ((InterfaceC1995Ko0) this.f28070b.zzb()).c(inputEvent);
    }

    final /* synthetic */ com.google.common.util.concurrent.p d(Boolean bool) {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p e(Context context) {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).e(context);
    }

    final /* synthetic */ void f() {
        ((C5667wo0) this.f28069a.zzb()).a(this.f28073e);
    }

    final /* synthetic */ com.google.common.util.concurrent.p g(EnumC5541vo0 enumC5541vo0) {
        return ((InterfaceC1737Fp0) this.f28071c.zzb()).zza();
    }

    final /* synthetic */ com.google.common.util.concurrent.p h(Boolean bool) {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final String zza() {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final com.google.common.util.concurrent.p zzb() {
        if (this.f28072d) {
            return (AbstractC4678ox0) AbstractC5685wx0.j((AbstractC4678ox0) AbstractC5685wx0.j((AbstractC4678ox0) AbstractC5685wx0.g(AbstractC4678ox0.B(((C5667wo0) this.f28069a.zzb()).b()), Throwable.class, C2772Zn0.f26301a, AbstractC2272Px0.a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.ao0
                @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                    return this.f26642a.g((EnumC5541vo0) obj);
                }
            }, AbstractC2272Px0.a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.bo0
                @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                    return this.f26931a.h((Boolean) obj);
                }
            }, AbstractC2272Px0.a());
        }
        AbstractC4678ox0 abstractC4678ox0 = (AbstractC4678ox0) AbstractC5685wx0.j((AbstractC4678ox0) AbstractC5685wx0.g(AbstractC4678ox0.B(((InterfaceC1737Fp0) this.f28071c.zzb()).zza()), Throwable.class, C3151co0.f27220a, AbstractC2272Px0.a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Xn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f25388a.d((Boolean) obj);
            }
        }, AbstractC2272Px0.a());
        abstractC4678ox0.e(new Runnable() { // from class: com.google.android.gms.internal.ads.Yn0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25700a.f();
            }
        }, AbstractC2272Px0.a());
        return abstractC4678ox0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Ul0
    public final int zzg() {
        return ((InterfaceC1995Ko0) this.f28070b.zzb()).zzg();
    }
}
