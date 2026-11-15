package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4945r40 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f32778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IQ f32779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6019zb0 f32781d;

    public C4945r40(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, IQ iq, C6019zb0 c6019zb0, String str) {
        this.f32778a = interfaceExecutorServiceC1805Gx0;
        this.f32779b = iq;
        this.f32781d = c6019zb0;
        this.f32780c = str;
    }

    final /* synthetic */ C5071s40 a() {
        C6019zb0 c6019zb0 = this.f32781d;
        IQ iq = this.f32779b;
        return new C5071s40(iq.b(c6019zb0.f35798g, this.f32780c), iq.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f32778a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.q40
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f32562a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 17;
    }
}
