package com.google.android.play.core.integrity;

import V5.InterfaceC0975l;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6699m implements InterfaceC0975l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V5.o f39875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V5.o f39876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5.o f39877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V5.o f39878d;

    public C6699m(V5.o oVar, V5.o oVar2, V5.o oVar3, V5.o oVar4) {
        this.f39875a = oVar;
        this.f39876b = oVar2;
        this.f39877c = oVar3;
        this.f39878d = oVar4;
    }

    @Override // V5.o
    public final /* bridge */ /* synthetic */ Object a() {
        return new C6697k((Context) this.f39875a.a(), (V5.E) this.f39876b.a(), ((C6704s) this.f39877c).a(), new W());
    }
}
