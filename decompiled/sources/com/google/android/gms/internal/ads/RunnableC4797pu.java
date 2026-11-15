package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4797pu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC5174su f32501a;

    RunnableC4797pu(TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su) {
        Objects.requireNonNull(textureViewSurfaceTextureListenerC5174su);
        this.f32501a = textureViewSurfaceTextureListenerC5174su;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su = this.f32501a;
        if (textureViewSurfaceTextureListenerC5174su.K() != null) {
            textureViewSurfaceTextureListenerC5174su.K().zzd();
        }
    }
}
