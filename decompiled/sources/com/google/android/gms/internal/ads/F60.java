package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F60 implements InterfaceC4637od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C2337Re f18675a = new C2337Re();

    protected F60() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void b(long j10) {
        k(f(), j10, 5, false);
    }

    protected abstract void k(int i10, long j10, int i11, boolean z9);

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final boolean zza() {
        return c() == 3 && zzk() && zzi() == 0;
    }
}
