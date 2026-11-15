package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class GW0 implements InterfaceC3117cX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SW0 f19062a;

    /* synthetic */ GW0(SW0 sw0, byte[] bArr) {
        Objects.requireNonNull(sw0);
        this.f19062a = sw0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117cX0
    public final void a(long j10) {
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j10);
        YU.c("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117cX0
    public final void b(final long j10) {
        RR rr = new RR() { // from class: com.google.android.gms.internal.ads.FW0
            @Override // com.google.android.gms.internal.ads.RR
            public final /* synthetic */ void zza(Object obj) {
                ((JV0) obj).a(j10);
            }
        };
        C5752xU c5752xUJ = this.f19062a.j();
        c5752xUJ.d(-1, rr);
        c5752xUJ.e();
    }
}
