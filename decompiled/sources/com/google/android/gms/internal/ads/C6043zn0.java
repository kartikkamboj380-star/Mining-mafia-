package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6043zn0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35853e;

    private C6043zn0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f35849a = interfaceC4864qQ0;
        this.f35850b = interfaceC4864qQ1;
        this.f35851c = interfaceC4864qQ2;
        this.f35852d = interfaceC4864qQ3;
        this.f35853e = interfaceC4864qQ4;
    }

    public static C6043zn0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C6043zn0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5917yn0((C1966Ka) this.f35849a.zzb(), (InterfaceC2718Ym0) this.f35850b.zzb(), (Map) this.f35851c.zzb(), (Context) this.f35852d.zzb(), (C5043rr0) this.f35853e.zzb());
    }
}
