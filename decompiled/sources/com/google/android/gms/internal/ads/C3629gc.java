package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3629gc implements InterfaceC3390ei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1721Fh0 f28693a;

    C3629gc(C1721Fh0 c1721Fh0) {
        this.f28693a = c1721Fh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ei0
    public final void a(int i10, long j10, String str) {
        this.f28693a.f(i10, System.currentTimeMillis() - j10, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ei0
    public final void b(int i10, long j10) {
        this.f28693a.b(i10, System.currentTimeMillis() - j10);
    }
}
