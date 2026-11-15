package com.google.firebase.installations;

import p176r5.C7094k;

/* JADX INFO: loaded from: classes3.dex */
class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f40116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7094k f40117b;

    public e(i iVar, C7094k c7094k) {
        this.f40116a = iVar;
        this.f40117b = c7094k;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f40117b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(I6.d dVar) {
        if (!dVar.k() || this.f40116a.f(dVar)) {
            return false;
        }
        this.f40117b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
