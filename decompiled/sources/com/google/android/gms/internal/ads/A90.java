package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class A90 implements InterfaceC1971Kc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U90 f17257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W90 f17258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H4.h2 f17259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H4.s2 f17262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1451Ac0 f17263g;

    public A90(U90 u90, W90 w90, H4.h2 h2Var, String str, Executor executor, H4.s2 s2Var, InterfaceC1451Ac0 interfaceC1451Ac0) {
        this.f17257a = u90;
        this.f17258b = w90;
        this.f17259c = h2Var;
        this.f17260d = str;
        this.f17261e = executor;
        this.f17262f = s2Var;
        this.f17263g = interfaceC1451Ac0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1971Kc0
    public final Executor zza() {
        return this.f17261e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1971Kc0
    public final InterfaceC1451Ac0 zzb() {
        return this.f17263g;
    }
}
