package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4545nu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC5174su f31906a;

    RunnableC4545nu(TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su) {
        Objects.requireNonNull(textureViewSurfaceTextureListenerC5174su);
        this.f31906a = textureViewSurfaceTextureListenerC5174su;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su = this.f31906a;
        if (textureViewSurfaceTextureListenerC5174su.K() != null) {
            textureViewSurfaceTextureListenerC5174su.K().zzd();
            textureViewSurfaceTextureListenerC5174su.K().c();
        }
    }
}
