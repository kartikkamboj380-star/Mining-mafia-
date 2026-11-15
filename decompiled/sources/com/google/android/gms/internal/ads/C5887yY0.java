package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5887yY0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4880qY0 f35385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35386d;

    public C5887yY0(JY0 jy0, Throwable th, boolean z9, int i10) {
        String string = jy0.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i10);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = jy0.f19929o;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iAbs).length() + 60);
        sb2.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb2.append(iAbs);
        this(string2, th, str, false, null, sb2.toString(), null);
    }

    final /* synthetic */ C5887yY0 a(C5887yY0 c5887yY0) {
        return new C5887yY0(getMessage(), getCause(), this.f35383a, false, this.f35385c, this.f35386d, c5887yY0);
    }

    public C5887yY0(JY0 jy0, Throwable th, boolean z9, C4880qY0 c4880qY0) {
        String str = c4880qY0.f32656a;
        int length = str.length();
        String string = jy0.toString();
        StringBuilder sb = new StringBuilder(length + 23 + string.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(string);
        this(sb.toString(), th, jy0.f19929o, false, c4880qY0, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private C5887yY0(String str, Throwable th, String str2, boolean z9, C4880qY0 c4880qY0, String str3, C5887yY0 c5887yY0) {
        super(str, th);
        this.f35383a = str2;
        this.f35384b = false;
        this.f35385c = c4880qY0;
        this.f35386d = str3;
    }
}
