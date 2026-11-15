package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3953jC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30345j;

    private C3953jC(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6, InterfaceC4864qQ0 interfaceC4864qQ7, InterfaceC4864qQ0 interfaceC4864qQ8, InterfaceC4864qQ0 interfaceC4864qQ9) {
        this.f30336a = interfaceC4864qQ0;
        this.f30337b = interfaceC4864qQ1;
        this.f30338c = interfaceC4864qQ2;
        this.f30339d = interfaceC4864qQ3;
        this.f30340e = interfaceC4864qQ4;
        this.f30341f = interfaceC4864qQ5;
        this.f30342g = interfaceC4864qQ6;
        this.f30343h = interfaceC4864qQ7;
        this.f30344i = interfaceC4864qQ8;
        this.f30345j = interfaceC4864qQ9;
    }

    public static C3953jC b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6, InterfaceC4864qQ0 interfaceC4864qQ7, InterfaceC4864qQ0 interfaceC4864qQ8, InterfaceC4864qQ0 interfaceC4864qQ9) {
        return new C3953jC(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5, interfaceC4864qQ6, interfaceC4864qQ7, interfaceC4864qQ8, interfaceC4864qQ9);
    }

    public static C3829iC c(C4585oD c4585oD, Context context, C3628gb0 c3628gb0, View view, InterfaceC1750Fw interfaceC1750Fw, InterfaceC4459nD interfaceC4459nD, YM ym, C4851qK c4851qK, InterfaceC2978bQ0 interfaceC2978bQ0, Executor executor) {
        return new C3829iC(c4585oD, context, c3628gb0, view, interfaceC1750Fw, interfaceC4459nD, ym, c4851qK, interfaceC2978bQ0, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3829iC zzb() {
        return new C3829iC(((C5846yE) this.f30336a).zzb(), (Context) this.f30337b.zzb(), ((C4709pC) this.f30338c).a(), ((C4583oC) this.f30339d).a(), ((DC) this.f30340e).a(), ((C4835qC) this.f30341f).a(), ((TL) this.f30342g).a(), (C4851qK) this.f30343h.zzb(), C3606gQ0.b(this.f30344i), (Executor) this.f30345j.zzb());
    }
}
