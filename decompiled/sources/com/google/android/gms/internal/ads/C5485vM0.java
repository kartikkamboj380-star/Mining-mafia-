package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5485vM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f34047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f34048b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    final /* synthetic */ void a(int i10, int i11) {
        MediaCodec.CryptoInfo.Pattern pattern = this.f34048b;
        pattern.set(i10, i11);
        this.f34047a.setPattern(pattern);
    }
}
