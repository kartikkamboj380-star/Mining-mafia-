package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2992bX0 implements VV0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WW0 f26846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C5752xU f26847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3471fM f26848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AV0 f26849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private FV0 f26850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f26851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f26852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3746hX0 f26853i;

    /* synthetic */ C2992bX0(VW0 vw0, byte[] bArr) {
        this.f26845a = vw0.d();
        C3746hX0 c3746hX0G = vw0.g();
        c3746hX0G.getClass();
        this.f26853i = c3746hX0G;
        this.f26849e = vw0.e();
        this.f26846b = vw0.d() != null ? new WW0(this, null) : null;
        this.f26848d = InterfaceC3471fM.f28270a;
    }

    private final void i(OV0 ov0) {
        Context context;
        j();
        FV0 fv0 = this.f26850f;
        if (fv0 == null && (context = this.f26845a) != null) {
            FV0 fv1 = new FV0(context, new EV0() { // from class: com.google.android.gms.internal.ads.UW0
                @Override // com.google.android.gms.internal.ads.EV0
                public final /* synthetic */ void a(AV0 av0) {
                    this.f24030a.f(av0);
                }
            }, ov0.f21567b, ov0.f21568c);
            this.f26850f = fv1;
            this.f26849e = fv1.d();
        } else if (fv0 != null) {
            AudioDeviceInfo audioDeviceInfo = ov0.f21568c;
            if (audioDeviceInfo != null) {
                fv0.c(audioDeviceInfo);
            }
            this.f26850f.b(ov0.f21567b);
        }
        this.f26849e.getClass();
    }

    private final void j() {
        if (this.f26845a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f26851g;
        boolean z9 = true;
        if (looper != null && looper != looperMyLooper) {
            z9 = false;
        }
        String strK = k(looper);
        String strK2 = k(looperMyLooper);
        if (!z9) {
            throw new IllegalStateException(AbstractC4040jt0.d("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", strK, strK2));
        }
        this.f26851g = looperMyLooper;
    }

    private static String k(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.VV0
    public final void a(SV0 sv0) {
        j();
        if (this.f26847c == null) {
            C5752xU c5752xU = new C5752xU(Thread.currentThread());
            this.f26847c = c5752xU;
            c5752xU.g(false);
        }
        this.f26847c.b(sv0);
    }

    @Override // com.google.android.gms.internal.ads.VV0
    public final void b(InterfaceC3471fM interfaceC3471fM) {
        this.f26848d = interfaceC3471fM;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004b  */
    @Override // com.google.android.gms.internal.ads.VV0
    public final QV0 c(OV0 ov0) {
        i(ov0);
        C3746hX0 c3746hX0 = this.f26853i;
        JY0 jy0 = ov0.f21566a;
        C4966rF c4966rF = ov0.f21567b;
        HV0 hv0A = c3746hX0.a(jy0, c4966rF);
        PV0 pv0 = new PV0();
        int i10 = 0;
        if (Objects.equals(jy0.f19929o, "audio/raw")) {
            int i11 = jy0.f19908I;
            if (!AbstractC4634ob0.a(i11)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 22);
                sb.append("Invalid PCM encoding: ");
                sb.append(i11);
                YU.c("ATAudioOutputProvider", sb.toString());
            } else if (i11 != 2) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        } else if (this.f26849e.d(jy0, c4966rF) != null) {
            i10 = 2;
        }
        pv0.d(i10);
        pv0.a(hv0A.f19305a);
        pv0.b(hv0A.f19306b);
        pv0.c(hv0A.f19307c);
        return pv0.e();
    }

    @Override // com.google.android.gms.internal.ads.VV0
    public final UV0 d(OV0 ov0) throws MV0 {
        int i10;
        int iIntValue;
        int i11;
        int iD;
        int i12;
        i(ov0);
        JY0 jy0 = ov0.f21566a;
        String str = jy0.f19929o;
        if (Objects.equals(str, "audio/raw")) {
            int i13 = jy0.f19908I;
            AbstractC2418Ss0.a(AbstractC4634ob0.a(i13));
            i10 = jy0.f19907H;
            int i14 = jy0.f19906G;
            iIntValue = AbstractC4634ob0.b(i14);
            iD = AbstractC4634ob0.d(i13) * i14;
            i12 = i13;
            i11 = 0;
        } else {
            i10 = jy0.f19907H;
            HV0 hv0 = HV0.f19304d;
            Pair pairD = this.f26849e.d(jy0, ov0.f21567b);
            if (pairD == null) {
                throw new MV0("Unable to configure passthrough for: ".concat(String.valueOf(jy0)));
            }
            int iIntValue2 = ((Integer) pairD.first).intValue();
            iIntValue = ((Integer) pairD.second).intValue();
            i11 = 2;
            iD = -1;
            i12 = iIntValue2;
        }
        int i15 = i10;
        int i16 = jy0.f19924j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i16 == -1) {
            i16 = 768000;
        }
        int i17 = i16;
        int iMax = ov0.f21571f;
        if (iMax == -1) {
            int i18 = iD;
            int minBufferSize = AudioTrack.getMinBufferSize(i15, iIntValue, i12);
            AbstractC2418Ss0.i(minBufferSize != -2);
            int i19 = i18 == -1 ? 1 : i18;
            int i20 = i19;
            iMax = (((Math.max(minBufferSize, C5255tX0.b(minBufferSize, i12, i11, i19, i15, i17)) + i20) - 1) / i20) * i20;
        }
        TV0 tv0 = new TV0();
        tv0.b(i15);
        tv0.c(iIntValue);
        tv0.a(i12);
        tv0.e(iMax);
        tv0.g(ov0.f21569d);
        tv0.f(ov0.f21567b);
        tv0.d(false);
        tv0.h(ov0.f21570e);
        return new UV0(tv0, null);
    }

    public final SW0 e(UV0 uv0) throws RV0 {
        Context context;
        try {
            int i10 = uv0.f24027g;
            int i11 = uv0.f24028h;
            Context context2 = null;
            if (i11 != -1 && (context = this.f26845a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f26852h;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f26852h = context.createDeviceContext(i11);
                }
                context2 = this.f26852h;
                i10 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(uv0.f24026f.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(uv0.f24022b).setChannelMask(uv0.f24023c).setEncoding(uv0.f24021a).build()).setTransferMode(1).setBufferSizeInBytes(uv0.f24025e).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i12 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new SW0(audioTrackBuild, uv0, this.f26846b, this.f26848d);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new RV0();
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RV0(e);
        } catch (UnsupportedOperationException e11) {
            e = e11;
            throw new RV0(e);
        }
    }

    final void f(AV0 av0) {
        j();
        AV0 av1 = this.f26849e;
        if (av1 == null || av0.equals(av1)) {
            return;
        }
        this.f26849e = av0;
        C5752xU c5752xU = this.f26847c;
        if (c5752xU != null) {
            c5752xU.d(-1, TW0.f23535a);
            c5752xU.e();
        }
    }

    final /* synthetic */ void g(AV0 av0) {
        this.f26849e = av0;
    }

    final /* synthetic */ FV0 h() {
        return this.f26850f;
    }

    @Override // com.google.android.gms.internal.ads.VV0
    public final void zze() {
        C5752xU c5752xU = this.f26847c;
        if (c5752xU != null) {
            c5752xU.f();
        }
        FV0 fv0 = this.f26850f;
        if (fv0 != null) {
            fv0.e();
        }
    }
}
