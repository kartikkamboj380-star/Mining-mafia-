package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2002Ks implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20289b;

    private C2002Ks(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f20288a = interfaceC4864qQ0;
        this.f20289b = interfaceC4864qQ1;
    }

    public static C2002Ks a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C2002Ks(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SharedPreferencesOnSharedPreferenceChangeListenerC1950Js((Context) this.f20288a.zzb(), (InterfaceC0790q0) this.f20289b.zzb());
    }
}
