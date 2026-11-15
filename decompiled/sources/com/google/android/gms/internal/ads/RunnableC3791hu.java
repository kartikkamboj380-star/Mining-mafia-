package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3791hu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f29128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC5174su f29129b;

    RunnableC3791hu(TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su, MediaPlayer mediaPlayer) {
        this.f29128a = mediaPlayer;
        Objects.requireNonNull(textureViewSurfaceTextureListenerC5174su);
        this.f29129b = textureViewSurfaceTextureListenerC5174su;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su = this.f29129b;
        textureViewSurfaceTextureListenerC5174su.J(this.f29128a);
        if (textureViewSurfaceTextureListenerC5174su.K() != null) {
            textureViewSurfaceTextureListenerC5174su.K().zzb();
        }
    }
}
