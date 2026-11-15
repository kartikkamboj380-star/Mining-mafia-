package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class LM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2607Wj f20432a;

    public LM(BinderC5484vM binderC5484vM) {
        this.f20432a = binderC5484vM;
    }

    public final synchronized InterfaceC2607Wj a() {
        return this.f20432a;
    }

    public final synchronized void b(InterfaceC2607Wj interfaceC2607Wj) {
        this.f20432a = interfaceC2607Wj;
    }
}
