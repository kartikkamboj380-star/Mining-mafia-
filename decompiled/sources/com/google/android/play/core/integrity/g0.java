package com.google.android.play.core.integrity;

import V5.C0974k;
import V5.InterfaceC0975l;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class g0 implements InterfaceC6706u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f39848a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V5.o f39849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5.o f39850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V5.o f39851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V5.o f39852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V5.o f39853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V5.o f39854g;

    /* synthetic */ g0(Context context, T5.k kVar) {
        InterfaceC0975l interfaceC0975lB = V5.m.b(context);
        this.f39849b = interfaceC0975lB;
        V5.o oVarB = C0974k.b(A.f39788a);
        this.f39850c = oVarB;
        C6704s c6704s = new C6704s(interfaceC0975lB, b0.f39834a);
        this.f39851d = c6704s;
        V5.o oVarB2 = C0974k.b(new L(interfaceC0975lB, oVarB, c6704s, b0.f39834a));
        this.f39852e = oVarB2;
        V5.o oVarB3 = C0974k.b(new Q(oVarB2));
        this.f39853f = oVarB3;
        this.f39854g = C0974k.b(new C6711z(oVarB2, oVarB3));
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6706u
    public final InterfaceC6689c a() {
        return (InterfaceC6689c) this.f39854g.a();
    }
}
