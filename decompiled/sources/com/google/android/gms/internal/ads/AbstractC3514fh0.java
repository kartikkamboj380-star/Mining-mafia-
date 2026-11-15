package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3514fh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f28458a = 2;

    public static void a(Context context) {
        context.registerReceiver(new C3388eh0(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (AbstractC3012bh0.b() != EnumC4518ng0.CTV) {
            return 2;
        }
        return f28458a;
    }
}
