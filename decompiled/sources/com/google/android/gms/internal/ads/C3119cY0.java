package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3119cY0 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    C3119cY0(C3998jY0 c3998jY0) {
        Objects.requireNonNull(c3998jY0);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
