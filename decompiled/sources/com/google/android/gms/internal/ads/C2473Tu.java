package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2473Tu implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f23625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2421Su f23626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23630f = 1.0f;

    public C2473Tu(Context context, InterfaceC2421Su interfaceC2421Su) {
        this.f23625a = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f23626b = interfaceC2421Su;
    }

    private final void f() {
        if (!this.f23628d || this.f23629e || this.f23630f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.f23627c) {
                AudioManager audioManager = this.f23625a;
                if (audioManager != null) {
                    this.f23627c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f23626b.a();
                return;
            }
            return;
        }
        if (this.f23627c) {
            return;
        }
        AudioManager audioManager2 = this.f23625a;
        if (audioManager2 != null) {
            this.f23627c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f23626b.a();
    }

    public final void a(boolean z9) {
        this.f23629e = z9;
        f();
    }

    public final void b(float f10) {
        this.f23630f = f10;
        f();
    }

    public final float c() {
        return this.f23627c ? this.f23629e ? 0.0f : this.f23630f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d() {
        this.f23628d = true;
        f();
    }

    public final void e() {
        this.f23628d = false;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f23627c = i10 > 0;
        this.f23626b.a();
    }
}
