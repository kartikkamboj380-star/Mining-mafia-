package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3746hX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f29013b;

    public C3746hX0(Context context) {
        this.f29012a = context == null ? null : context.getApplicationContext();
    }

    public final HV0 a(JY0 jy0, C4966rF c4966rF) {
        int i10;
        boolean zBooleanValue;
        jy0.getClass();
        c4966rF.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || (i10 = jy0.f19907H) == -1) {
            return HV0.f19304d;
        }
        Context context = this.f29012a;
        Boolean bool = this.f29013b;
        boolean z9 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = AbstractC5304tw.a(context).getParameters("offloadVariableRateSupported");
                this.f29013b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f29013b = Boolean.FALSE;
            }
            zBooleanValue = this.f29013b.booleanValue();
        }
        String str = jy0.f19929o;
        str.getClass();
        int iG = A8.g(str, jy0.f19925k);
        if (iG == 0 || i11 < AbstractC4634ob0.c(iG)) {
            return HV0.f19304d;
        }
        int iB = AbstractC4634ob0.b(jy0.f19906G);
        if (iB == 0) {
            return HV0.f19304d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(iB).setEncoding(iG).build();
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, c4966rF.a())) {
                    return HV0.f19304d;
                }
                GV0 gv0 = new GV0();
                gv0.a(true);
                gv0.c(zBooleanValue);
                return gv0.d();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, c4966rF.a());
            if (playbackOffloadSupport == 0) {
                return HV0.f19304d;
            }
            GV0 gv1 = new GV0();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                z9 = true;
            }
            gv1.a(true);
            gv1.b(z9);
            gv1.c(zBooleanValue);
            return gv1.d();
        } catch (IllegalArgumentException unused) {
            return HV0.f19304d;
        }
    }
}
