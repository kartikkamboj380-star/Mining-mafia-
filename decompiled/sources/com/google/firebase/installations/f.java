package com.google.firebase.installations;

import p176r5.C7094k;

/* JADX INFO: loaded from: classes3.dex */
class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C7094k f40118a;

    public f(C7094k c7094k) {
        this.f40118a = c7094k;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(I6.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f40118a.e(dVar.d());
        return true;
    }
}
