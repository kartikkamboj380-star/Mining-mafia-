package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class GW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4539nr f19061a;

    GW(AbstractC4539nr abstractC4539nr) {
        this.f19061a = abstractC4539nr;
    }

    public final void a() {
        com.google.common.util.concurrent.p pVarA = this.f19061a.a();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29618L8)).booleanValue()) {
            AbstractC2471Tt.b(pVarA, "persistFlags");
        } else {
            AbstractC2471Tt.a(pVarA, "persistFlags");
        }
    }
}
