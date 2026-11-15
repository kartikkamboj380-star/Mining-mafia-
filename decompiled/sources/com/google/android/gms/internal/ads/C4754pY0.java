package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4754pY0 extends AbstractC5487vN0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32421a;

    public C4754pY0(Throwable th, C4880qY0 c4880qY0) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(c4880qY0 == null ? null : c4880qY0.f32656a)), th);
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.f32421a = errorCode;
    }
}
