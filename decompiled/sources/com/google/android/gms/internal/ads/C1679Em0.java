package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Em0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1679Em0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18563a;

    private C1679Em0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f18563a = interfaceC4864qQ0;
    }

    public static C1679Em0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C1679Em0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.f18563a.zzb()).getResources().getDisplayMetrics();
        AbstractC4738pQ0.b(displayMetrics);
        return displayMetrics;
    }
}
