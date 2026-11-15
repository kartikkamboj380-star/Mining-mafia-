package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5379uW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f33836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f33837b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33841f;

    public C5379uW0(AudioTrack audioTrack) {
        this.f33836a = audioTrack;
    }

    public final boolean a() {
        AudioTrack audioTrack = this.f33836a;
        AudioTimestamp audioTimestamp = this.f33837b;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j10 = audioTimestamp.framePosition;
            if (this.f33839d > j10) {
                this.f33838c++;
            }
            this.f33839d = j10;
            this.f33840e = j10 + this.f33841f + (this.f33838c << 32);
        }
        return timestamp;
    }

    public final long b() {
        return this.f33837b.nanoTime / 1000;
    }

    public final long c() {
        return this.f33840e;
    }
}
