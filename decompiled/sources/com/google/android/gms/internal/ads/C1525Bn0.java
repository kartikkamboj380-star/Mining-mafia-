package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1525Bn0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17709f;

    private C1525Bn0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5) {
        this.f17704a = interfaceC4864qQ0;
        this.f17705b = interfaceC4864qQ1;
        this.f17706c = interfaceC4864qQ2;
        this.f17707d = interfaceC4864qQ3;
        this.f17708e = interfaceC4864qQ4;
        this.f17709f = interfaceC4864qQ5;
    }

    public static C1525Bn0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5) {
        return new C1525Bn0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1473An0((C1966Ka) this.f17704a.zzb(), (InterfaceC2718Ym0) this.f17705b.zzb(), (EnumC2894al0) this.f17706c.zzb(), (Context) this.f17707d.zzb(), (Map) this.f17708e.zzb(), (C5043rr0) this.f17709f.zzb());
    }
}
