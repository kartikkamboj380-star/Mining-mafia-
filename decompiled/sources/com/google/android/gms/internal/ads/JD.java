package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class JD implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FD f19807a;

    private JD(FD fd) {
        this.f19807a = fd;
    }

    public static JD b(FD fd) {
        return new JD(fd);
    }

    public static C5011rb0 c(FD fd) {
        C5011rb0 c5011rb0A = fd.a();
        AbstractC4738pQ0.b(c5011rb0A);
        return c5011rb0A;
    }

    public final C5011rb0 a() {
        return c(this.f19807a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f19807a);
    }
}
