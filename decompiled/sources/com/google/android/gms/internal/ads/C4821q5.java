package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4821q5 implements InterfaceC5576w5 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5576w5
    public final int a(JY0 jy0) {
        String str = jy0.f19929o;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/vobsub":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5576w5
    public final boolean b(JY0 jy0) {
        String str = jy0.f19929o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5576w5
    public final InterfaceC5828y5 c(JY0 jy0) {
        String str = jy0.f19929o;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new O5(jy0.f19932r);
                case "text/vtt":
                    return new C4948r6();
                case "application/x-mp4-vtt":
                    return new C3691h6();
                case "application/x-subrip":
                    return new S5();
                case "application/x-quicktime-tx3g":
                    return new C3313e6(jy0.f19932r);
                case "application/pgs":
                    return new M5();
                case "application/vobsub":
                    return new C3565g6(jy0.f19932r);
                case "application/dvbsubs":
                    return new K5(jy0.f19932r);
                case "application/ttml+xml":
                    return new Z5();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
