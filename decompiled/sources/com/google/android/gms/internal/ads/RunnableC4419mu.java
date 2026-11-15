package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4419mu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f31586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f31587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC5174su f31588c;

    RunnableC4419mu(TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su, int i10, int i11) {
        this.f31586a = i10;
        this.f31587b = i11;
        Objects.requireNonNull(textureViewSurfaceTextureListenerC5174su);
        this.f31588c = textureViewSurfaceTextureListenerC5174su;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su = this.f31588c;
        if (textureViewSurfaceTextureListenerC5174su.K() != null) {
            textureViewSurfaceTextureListenerC5174su.K().zzj(this.f31586a, this.f31587b);
        }
    }
}
