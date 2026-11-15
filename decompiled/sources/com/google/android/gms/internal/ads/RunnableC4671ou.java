package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4671ou implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC5174su f32218a;

    RunnableC4671ou(TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su) {
        Objects.requireNonNull(textureViewSurfaceTextureListenerC5174su);
        this.f32218a = textureViewSurfaceTextureListenerC5174su;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su = this.f32218a;
        if (textureViewSurfaceTextureListenerC5174su.K() != null) {
            if (!textureViewSurfaceTextureListenerC5174su.L()) {
                textureViewSurfaceTextureListenerC5174su.K().zzk();
                textureViewSurfaceTextureListenerC5174su.M(true);
            }
            textureViewSurfaceTextureListenerC5174su.K().zzc();
        }
    }
}
