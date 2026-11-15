package com.google.android.play.core.integrity;

import V5.C0974k;
import V5.InterfaceC0975l;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f39839a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V5.o f39840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5.o f39841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V5.o f39842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V5.o f39843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V5.o f39844f;

    /* synthetic */ e0(Context context, T5.i iVar) {
        InterfaceC0975l interfaceC0975lB = V5.m.b(context);
        this.f39840b = interfaceC0975lB;
        V5.o oVarB = C0974k.b(AbstractC6693g.f39847a);
        this.f39841c = oVarB;
        C6704s c6704s = new C6704s(interfaceC0975lB, Z.f39831a);
        this.f39842d = c6704s;
        V5.o oVarB2 = C0974k.b(new C6699m(interfaceC0975lB, oVarB, c6704s, Z.f39831a));
        this.f39843e = oVarB2;
        this.f39844f = C0974k.b(new C6692f(oVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f39844f.a();
    }
}
