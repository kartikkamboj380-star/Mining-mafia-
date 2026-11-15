package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class GD implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FD f19006a;

    private GD(FD fd) {
        this.f19006a = fd;
    }

    public static GD b(FD fd) {
        return new GD(fd);
    }

    public static C3502fb0 c(FD fd) {
        C3502fb0 c3502fb0B = fd.b();
        AbstractC4738pQ0.b(c3502fb0B);
        return c3502fb0B;
    }

    public final C3502fb0 a() {
        return c(this.f19006a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f19006a);
    }
}
