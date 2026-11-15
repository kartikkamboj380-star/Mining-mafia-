package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4729pM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32367b;

    private C4729pM(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f32366a = interfaceC4864qQ0;
        this.f32367b = interfaceC4864qQ1;
    }

    public static C4729pM a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4729pM(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3845iK((Context) this.f32366a.zzb(), new HashSet(), ((GD) this.f32367b).a());
    }
}
