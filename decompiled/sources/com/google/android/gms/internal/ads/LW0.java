package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class LW0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PW0 f20537a;

    LW0(PW0 pw0) {
        Objects.requireNonNull(pw0);
        this.f20537a = pw0;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        C5752xU c5752xUJ = this.f20537a.f22125c.j();
        c5752xUJ.d(-1, JW0.f19893a);
        c5752xUJ.e();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        C5752xU c5752xUJ = this.f20537a.f22125c.j();
        c5752xUJ.d(-1, HW0.f19309a);
        c5752xUJ.e();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C5752xU c5752xUJ = this.f20537a.f22125c.j();
        c5752xUJ.d(-1, IW0.f19568a);
        c5752xUJ.e();
    }
}
