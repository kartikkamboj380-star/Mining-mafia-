package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class BV0 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FV0 f17630a;

    /* synthetic */ BV0(FV0 fv0, byte[] bArr) {
        Objects.requireNonNull(fv0);
        this.f17630a = fv0;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        FV0 fv0 = this.f17630a;
        fv0.f(AV0.a(fv0.g(), fv0.j(), fv0.h()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = AbstractC4634ob0.f32117a;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            FV0 fv0 = this.f17630a;
            if (Objects.equals(audioDeviceInfo, fv0.h())) {
                fv0.i(null);
                break;
            }
        }
        FV0 fv1 = this.f17630a;
        fv1.f(AV0.a(fv1.g(), fv1.j(), fv1.h()));
    }
}
