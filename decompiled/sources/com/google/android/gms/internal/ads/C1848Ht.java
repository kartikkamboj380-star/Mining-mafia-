package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1848Ht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f19407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f19408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4966rF f19409c = C4966rF.f32864b;

    public C1848Ht(int i10) {
    }

    public final C1848Ht a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f19407a = onAudioFocusChangeListener;
        this.f19408b = handler;
        return this;
    }

    public final C1848Ht b(C4966rF c4966rF) {
        this.f19409c = c4966rF;
        return this;
    }

    public final C5050rv c() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f19407a;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.f19408b;
        handler.getClass();
        return new C5050rv(1, onAudioFocusChangeListener, handler, this.f19409c, false);
    }
}
