package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class EW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f18513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f18514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioRouting.OnRoutingChangedListener f18515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WW0 f18516d;

    /* synthetic */ EW0(AudioTrack audioTrack, WW0 ww0, byte[] bArr) {
        this.f18513a = audioTrack;
        this.f18516d = ww0;
        Handler handlerY = AbstractC4634ob0.y(null);
        this.f18514b = handlerY;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.DW0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.f18180a.a(audioRouting);
            }
        };
        this.f18515c = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerY);
    }

    final /* synthetic */ void a(final AudioRouting audioRouting) {
        if (this.f18515c == null) {
            return;
        }
        ZI.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.BW0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17631a.b(audioRouting);
            }
        });
    }

    final /* synthetic */ void b(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.f18514b.post(new Runnable() { // from class: com.google.android.gms.internal.ads.CW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f17896a.c(routedDevice);
                }
            });
        }
    }

    final /* synthetic */ void c(AudioDeviceInfo audioDeviceInfo) {
        if (this.f18515c == null) {
            return;
        }
        C2992bX0 c2992bX0 = this.f18516d.f24792a;
        if (c2992bX0.h() != null) {
            c2992bX0.h().c(audioDeviceInfo);
        }
    }

    final /* synthetic */ void d() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.f18515c;
        onRoutingChangedListener.getClass();
        this.f18513a.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.f18515c = null;
    }
}
