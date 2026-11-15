package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4167ku implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC5174su f30894c;

    RunnableC4167ku(TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su, String str, String str2) {
        this.f30892a = str;
        this.f30893b = str2;
        Objects.requireNonNull(textureViewSurfaceTextureListenerC5174su);
        this.f30894c = textureViewSurfaceTextureListenerC5174su;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC5174su textureViewSurfaceTextureListenerC5174su = this.f30894c;
        if (textureViewSurfaceTextureListenerC5174su.K() != null) {
            textureViewSurfaceTextureListenerC5174su.K().b(this.f30892a, this.f30893b);
        }
    }
}
