package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3243dX0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f27432A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f27433B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3117cX0 f27434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3471fM f27435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f27436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioTrack f27437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f27440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C5505vW0 f27441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f27443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Method f27446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f27447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f27448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f27449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f27450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f27451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f27454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f27455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f27456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f27457x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f27458y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f27459z;

    public C3243dX0(InterfaceC3117cX0 interfaceC3117cX0, InterfaceC3471fM interfaceC3471fM, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f27434a = interfaceC3117cX0;
        this.f27435b = interfaceC3471fM;
        this.f27437d = audioTrack;
        try {
            this.f27446m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f27436c = new long[10];
        this.f27459z = -9223372036854775807L;
        this.f27458y = -9223372036854775807L;
        this.f27441h = new C5505vW0(audioTrack, interfaceC3117cX0);
        int sampleRate = audioTrack.getSampleRate();
        this.f27438e = sampleRate;
        boolean zA = AbstractC4634ob0.a(i10);
        this.f27440g = zA;
        this.f27439f = zA ? AbstractC4634ob0.N(i12 / i11, sampleRate) : -9223372036854775807L;
        this.f27450q = 0L;
        this.f27451r = 0L;
        this.f27432A = false;
        this.f27433B = 0L;
        this.f27454u = -9223372036854775807L;
        this.f27455v = -9223372036854775807L;
        this.f27448o = 0L;
        this.f27447n = 0L;
        this.f27442i = 1.0f;
        this.f27443j = -9223372036854775807L;
    }

    private final void g(long j10) {
        long j11 = this.f27443j;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long jS = AbstractC4634ob0.S(j10 - j11, this.f27442i);
        InterfaceC3471fM interfaceC3471fM = this.f27435b;
        long jZza = interfaceC3471fM.zza() - AbstractC4634ob0.L(jS);
        this.f27443j = -9223372036854775807L;
        this.f27434a.b(jZza);
    }

    private final long h(long j10) {
        long jR;
        if (this.f27453t == 0) {
            jR = this.f27454u != -9223372036854775807L ? AbstractC4634ob0.N(l(), this.f27438e) : j();
        } else {
            jR = AbstractC4634ob0.R(j10 + this.f27444k, this.f27442i);
        }
        long jMax = Math.max(0L, jR - this.f27447n);
        return this.f27454u != -9223372036854775807L ? Math.min(AbstractC4634ob0.N(this.f27457x, this.f27438e), jMax) : jMax;
    }

    private final void i() {
        this.f27444k = 0L;
        this.f27453t = 0;
        this.f27452s = 0;
        this.f27445l = 0L;
        this.f27458y = -9223372036854775807L;
        this.f27459z = -9223372036854775807L;
    }

    private final long j() {
        return AbstractC4634ob0.N(k(), this.f27438e);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    private final long k() {
        if (this.f27454u != -9223372036854775807L) {
            return Math.min(this.f27457x, l());
        }
        long jZzb = this.f27435b.zzb();
        if (jZzb - this.f27449p >= 5) {
            AudioTrack audioTrack = this.f27437d;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.f27450q > playbackHeadPosition) {
                        this.f27451r++;
                    }
                    this.f27450q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f27450q <= 0 || playState != 3) {
                    this.f27455v = -9223372036854775807L;
                    if (this.f27450q > playbackHeadPosition) {
                        this.f27451r++;
                    }
                    this.f27450q = playbackHeadPosition;
                } else if (this.f27455v == -9223372036854775807L) {
                    this.f27455v = jZzb;
                }
            }
            this.f27449p = jZzb;
        }
        return this.f27450q + this.f27433B + (this.f27451r << 32);
    }

    private final long l() {
        AudioTrack audioTrack = this.f27437d;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f27456w;
        }
        return this.f27456w + AbstractC4634ob0.O(AbstractC4634ob0.R(AbstractC4634ob0.M(this.f27435b.zzb()) - this.f27454u, this.f27442i), this.f27438e);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #0 {Exception -> 0x009e, blocks: (B:23:0x0076, B:25:0x0096), top: B:52:0x0076 }] */
    public final long a() {
        Method method;
        long jMax;
        AudioTrack audioTrack = this.f27437d;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.f27435b.zzc() / 1000;
            if (jZzc - this.f27445l >= 30000) {
                long j10 = j();
                if (j10 != 0) {
                    long[] jArr = this.f27436c;
                    jArr[this.f27452s] = AbstractC4634ob0.S(j10, this.f27442i) - jZzc;
                    this.f27452s = (this.f27452s + 1) % 10;
                    int i10 = this.f27453t;
                    if (i10 < 10) {
                        this.f27453t = i10 + 1;
                    }
                    this.f27445l = jZzc;
                    this.f27444k = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.f27453t;
                        if (i11 >= i12) {
                            break;
                        }
                        this.f27444k += jArr[i11] / ((long) i12);
                        i11++;
                    }
                    if (this.f27440g && (method = this.f27446m) != null && jZzc - this.f27448o >= 500000) {
                        try {
                            Integer num = (Integer) method.invoke(audioTrack, null);
                            String str = AbstractC4634ob0.f32117a;
                            long jIntValue = (((long) num.intValue()) * 1000) - this.f27439f;
                            this.f27447n = jIntValue;
                            jMax = Math.max(jIntValue, 0L);
                            this.f27447n = jMax;
                            if (jMax > 5000000) {
                                this.f27434a.a(jMax);
                                this.f27447n = 0L;
                            }
                        } catch (Exception unused) {
                            this.f27446m = null;
                        }
                        this.f27448o = jZzc;
                    }
                    this.f27441h.a(jZzc, this.f27442i, h(jZzc));
                }
            } else {
                if (this.f27440g) {
                    Integer num2 = (Integer) method.invoke(audioTrack, null);
                    String str2 = AbstractC4634ob0.f32117a;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f27439f;
                    this.f27447n = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f27447n = jMax;
                    if (jMax > 5000000) {
                        this.f27434a.a(jMax);
                        this.f27447n = 0L;
                    }
                    this.f27448o = jZzc;
                }
                this.f27441h.a(jZzc, this.f27442i, h(jZzc));
            }
        }
        long jZzc2 = this.f27435b.zzc() / 1000;
        C5505vW0 c5505vW0 = this.f27441h;
        boolean zB = c5505vW0.b();
        long jE = zB ? c5505vW0.e(jZzc2, this.f27442i) : h(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zB || !c5505vW0.c()) {
                g(jE);
            }
            long j11 = this.f27459z;
            if (j11 != -9223372036854775807L) {
                long j12 = jE - this.f27458y;
                long jR = AbstractC4634ob0.R(jZzc2 - j11, this.f27442i);
                long j13 = this.f27458y + jR;
                long jAbs = Math.abs(j13 - jE);
                if (j12 != 0 && jAbs < 1000000) {
                    long j14 = (jR * 10) / 100;
                    jE = Math.max(j13 - j14, Math.min(jE, j13 + j14));
                }
            }
            this.f27459z = jZzc2;
            this.f27458y = jE;
        } else if (playState == 1) {
            g(jE);
            return jE;
        }
        return jE;
    }

    public final void b() {
        if (this.f27454u != -9223372036854775807L) {
            this.f27454u = AbstractC4634ob0.M(this.f27435b.zzb());
        }
        this.f27443j = j();
        this.f27441h.d();
    }

    public final boolean c() {
        AudioTrack audioTrack = this.f27437d;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean d(long j10) {
        return this.f27455v != -9223372036854775807L && j10 > 0 && this.f27435b.zzb() - this.f27455v >= 200;
    }

    public final void e(long j10) {
        this.f27456w = k();
        this.f27454u = AbstractC4634ob0.M(this.f27435b.zzb());
        this.f27457x = j10;
    }

    public final void f() {
        i();
        if (this.f27454u == -9223372036854775807L) {
            this.f27441h.d();
        }
        this.f27456w = k();
    }
}
