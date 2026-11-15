package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5381uX0 implements InterfaceC4876qW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5759xX0 f33843a;

    /* synthetic */ C5381uX0(C5759xX0 c5759xX0, byte[] bArr) {
        Objects.requireNonNull(c5759xX0);
        this.f33843a = c5759xX0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4876qW0
    public final void a(Exception exc) {
        YU.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f33843a.q1().k(exc);
    }
}
