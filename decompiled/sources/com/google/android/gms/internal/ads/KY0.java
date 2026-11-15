package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes2.dex */
final class KY0 implements IY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f20225b;

    public KY0(boolean z9, boolean z10, boolean z11) {
        int i10 = 1;
        if (!z9 && !z10 && !z11) {
            i10 = 0;
        }
        this.f20224a = i10;
    }

    private final void d() {
        if (this.f20225b == null) {
            this.f20225b = new MediaCodecList(this.f20224a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.IY0
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.IY0
    public final MediaCodecInfo b(int i10) {
        d();
        return this.f20225b[i10];
    }

    @Override // com.google.android.gms.internal.ads.IY0
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.IY0
    public final int zza() {
        d();
        return this.f20225b.length;
    }

    @Override // com.google.android.gms.internal.ads.IY0
    public final boolean zzc() {
        return true;
    }
}
