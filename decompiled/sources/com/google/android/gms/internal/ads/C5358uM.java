package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5358uM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33790d;

    private C5358uM(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f33787a = interfaceC4864qQ0;
        this.f33788b = interfaceC4864qQ1;
        this.f33789c = interfaceC4864qQ2;
        this.f33790d = interfaceC4864qQ3;
    }

    public static C5358uM a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C5358uM(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C5142se c5142se = (C5142se) this.f33787a.zzb();
        Executor executor = (Executor) this.f33788b.zzb();
        Context context = (Context) this.f33789c.zzb();
        return new JB(executor, new C5336uB(context, c5142se), (Clock) this.f33790d.zzb());
    }
}
