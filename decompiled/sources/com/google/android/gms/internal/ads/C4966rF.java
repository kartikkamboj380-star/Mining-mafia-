package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4966rF {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4966rF f32864b = new C4966rF(0, 0, 1, 1, 0, false, true, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioAttributes f32865a;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    /* synthetic */ C4966rF(int i10, int i11, int i12, int i13, int i14, boolean z9, boolean z10, byte[] bArr) {
    }

    public final AudioAttributes a() {
        if (this.f32865a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i10 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f32865a = usage.build();
        }
        return this.f32865a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4966rF.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
