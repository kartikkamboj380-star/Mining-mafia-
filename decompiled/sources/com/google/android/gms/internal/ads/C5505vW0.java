package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5505vW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5379uW0 f34085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3117cX0 f34087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f34089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f34090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f34091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f34093i;

    public C5505vW0(AudioTrack audioTrack, InterfaceC3117cX0 interfaceC3117cX0) {
        this.f34085a = new C5379uW0(audioTrack);
        this.f34086b = audioTrack.getSampleRate();
        this.f34087c = interfaceC3117cX0;
        f(0);
    }

    private final void f(int i10) {
        this.f34088d = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f34091g = 0L;
            this.f34092h = -1L;
            this.f34093i = -9223372036854775807L;
            this.f34089e = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f34090f = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f34090f = j10;
    }

    private final long g(long j10, float f10) {
        C5379uW0 c5379uW0 = this.f34085a;
        return h(c5379uW0.c(), c5379uW0.b(), j10, f10);
    }

    private final long h(long j10, long j11, long j12, float f10) {
        return AbstractC4634ob0.N(j10, this.f34086b) + AbstractC4634ob0.R(j12 - j11, f10);
    }

    public final void a(long j10, float f10, long j11) {
        boolean z9;
        int i10;
        if (j10 - this.f34091g < this.f34090f) {
            return;
        }
        this.f34091g = j10;
        C5379uW0 c5379uW0 = this.f34085a;
        boolean zA = c5379uW0.a();
        if (zA) {
            long jB = c5379uW0.b();
            long jG = g(j10, f10);
            i10 = 2;
            if (Math.abs(jB - j10) > 5000000) {
                InterfaceC3117cX0 interfaceC3117cX0 = this.f34087c;
                long jC = c5379uW0.c();
                long jH = ((GW0) interfaceC3117cX0).f19062a.h();
                int length = String.valueOf(jC).length();
                int length2 = String.valueOf(jB).length();
                int length3 = String.valueOf(j10).length();
                StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j11).length() + 2 + String.valueOf(jH).length());
                sb.append("Spurious audio timestamp (system clock mismatch): ");
                sb.append(jC);
                sb.append(", ");
                sb.append(jB);
                sb.append(", ");
                sb.append(j10);
                sb.append(", ");
                sb.append(j11);
                sb.append(", ");
                sb.append(jH);
                YU.c("AudioTrackAudioOutput", sb.toString());
                f(4);
                z9 = zA;
            } else if (Math.abs(jG - j11) > 5000000) {
                InterfaceC3117cX0 interfaceC3117cX1 = this.f34087c;
                long jC2 = c5379uW0.c();
                long jH2 = ((GW0) interfaceC3117cX1).f19062a.h();
                int length4 = String.valueOf(jC2).length();
                int length5 = String.valueOf(jB).length();
                int length6 = String.valueOf(j10).length();
                int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j11).length() + 2;
                z9 = zA;
                StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(jH2).length());
                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(jC2);
                sb2.append(", ");
                sb2.append(jB);
                sb2.append(", ");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j11);
                sb2.append(", ");
                sb2.append(jH2);
                YU.c("AudioTrackAudioOutput", sb2.toString());
                f(4);
            } else {
                z9 = zA;
                if (this.f34088d == 4) {
                    f(0);
                }
            }
        } else {
            z9 = zA;
            i10 = 2;
        }
        int i11 = this.f34088d;
        if (i11 == 0) {
            if (!z9) {
                if (j10 - this.f34089e > 500000) {
                    f(3);
                    return;
                }
                return;
            } else {
                if (c5379uW0.b() >= this.f34089e) {
                    this.f34092h = c5379uW0.c();
                    this.f34093i = c5379uW0.b();
                    f(1);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 == i10) {
                if (z9) {
                    return;
                }
                f(0);
                return;
            } else {
                if (i11 == 3 && z9) {
                    f(0);
                    return;
                }
                return;
            }
        }
        if (!z9) {
            f(0);
            return;
        }
        long jC3 = c5379uW0.c();
        long j12 = this.f34092h;
        if (jC3 > j12) {
            if (Math.abs(g(j10, f10) - h(j12, this.f34093i, j10, f10)) < 1000) {
                f(2);
                return;
            }
        }
        if (j10 - this.f34089e > 2000000) {
            f(3);
        } else {
            this.f34092h = c5379uW0.c();
            this.f34093i = c5379uW0.b();
        }
    }

    public final boolean b() {
        return this.f34088d == 2;
    }

    public final boolean c() {
        int i10 = this.f34088d;
        return i10 == 0 || i10 == 1;
    }

    public final void d() {
        f(0);
    }

    public final long e(long j10, float f10) {
        return g(j10, f10);
    }
}
