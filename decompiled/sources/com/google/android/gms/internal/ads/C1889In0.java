package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.In0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1889In0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19650e;

    private C1889In0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f19646a = interfaceC4864qQ0;
        this.f19647b = interfaceC4864qQ1;
        this.f19648c = interfaceC4864qQ2;
        this.f19649d = interfaceC4864qQ3;
        this.f19650e = interfaceC4864qQ4;
    }

    public static C1889In0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C1889In0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1837Hn0((C1966Ka) this.f19646a.zzb(), (InterfaceC2718Ym0) this.f19647b.zzb(), (Map) this.f19648c.zzb(), (DisplayMetrics) this.f19649d.zzb(), (C5043rr0) this.f19650e.zzb());
    }
}
