package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5050rv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f33042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f33043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4966rF f33044d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f33046f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33041a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33045e = false;

    C5050rv(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C4966rF c4966rF, boolean z9) {
        this.f33043c = handler;
        this.f33044d = c4966rF;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f33042b = new C2006Ku(onAudioFocusChangeListener, handler);
        } else {
            this.f33042b = onAudioFocusChangeListener;
        }
        this.f33046f = i11 >= 26 ? AbstractC4295lv.a(1).setAudioAttributes(c4966rF.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final C4966rF a() {
        return this.f33044d;
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return this.f33042b;
    }

    final AudioFocusRequest c() {
        Object obj = this.f33046f;
        obj.getClass();
        return AbstractC4925qv.a(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5050rv)) {
            return false;
        }
        C5050rv c5050rv = (C5050rv) obj;
        int i10 = c5050rv.f33041a;
        return Objects.equals(this.f33042b, c5050rv.f33042b) && Objects.equals(this.f33043c, c5050rv.f33043c) && Objects.equals(this.f33044d, c5050rv.f33044d);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f33042b, this.f33043c, this.f33044d, Boolean.FALSE);
    }
}
