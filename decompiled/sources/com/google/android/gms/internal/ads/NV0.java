package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class NV0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JY0 f21260a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioDeviceInfo f21262c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4966rF f21261b = C4966rF.f32864b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21263d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21264e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21265f = -1;

    public NV0(JY0 jy0) {
        this.f21260a = jy0;
    }

    public final NV0 a(C4966rF c4966rF) {
        this.f21261b = c4966rF;
        return this;
    }

    public final NV0 b(AudioDeviceInfo audioDeviceInfo) {
        this.f21262c = audioDeviceInfo;
        return this;
    }

    public final NV0 c(int i10) {
        this.f21263d = i10;
        return this;
    }

    public final NV0 d(int i10) {
        this.f21264e = i10;
        return this;
    }

    public final NV0 e(int i10) {
        this.f21265f = -1;
        return this;
    }

    final /* synthetic */ JY0 f() {
        return this.f21260a;
    }

    final /* synthetic */ C4966rF g() {
        return this.f21261b;
    }

    final /* synthetic */ AudioDeviceInfo h() {
        return this.f21262c;
    }

    final /* synthetic */ int i() {
        return this.f21263d;
    }

    final /* synthetic */ int j() {
        return this.f21264e;
    }

    final /* synthetic */ int k() {
        return this.f21265f;
    }
}
