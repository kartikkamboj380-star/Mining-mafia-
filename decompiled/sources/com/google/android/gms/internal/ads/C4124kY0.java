package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4124kY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4880qY0 f30825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaFormat f30826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JY0 f30827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Surface f30828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCrypto f30829e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3998jY0 f30830f;

    private C4124kY0(C4880qY0 c4880qY0, MediaFormat mediaFormat, JY0 jy0, Surface surface, MediaCrypto mediaCrypto, C3998jY0 c3998jY0) {
        this.f30825a = c4880qY0;
        this.f30826b = mediaFormat;
        this.f30827c = jy0;
        this.f30828d = surface;
        this.f30830f = c3998jY0;
    }

    public static C4124kY0 a(C4880qY0 c4880qY0, MediaFormat mediaFormat, JY0 jy0, MediaCrypto mediaCrypto, C3998jY0 c3998jY0) {
        return new C4124kY0(c4880qY0, mediaFormat, jy0, null, null, c3998jY0);
    }

    public static C4124kY0 b(C4880qY0 c4880qY0, MediaFormat mediaFormat, JY0 jy0, Surface surface, MediaCrypto mediaCrypto) {
        return new C4124kY0(c4880qY0, mediaFormat, jy0, surface, null, null);
    }
}
