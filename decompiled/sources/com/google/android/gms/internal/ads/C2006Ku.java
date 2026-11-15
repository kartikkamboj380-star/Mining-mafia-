package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2006Ku implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f20292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f20293b;

    C2006Ku(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f20293b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = AbstractC4634ob0.f32117a;
        this.f20292a = new Handler(looper, null);
    }

    final /* synthetic */ void a(int i10) {
        this.f20293b.onAudioFocusChange(i10);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        AbstractC4634ob0.z(this.f20292a, new Runnable() { // from class: com.google.android.gms.internal.ads.iu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30116a.a(i10);
            }
        });
    }
}
