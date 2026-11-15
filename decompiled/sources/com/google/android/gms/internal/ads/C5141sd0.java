package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5141sd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f33203b;

    public C5141sd0(Context context) {
        this.f33202a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized void b(boolean z9, boolean z10) {
        if (z9) {
            if (this.f33203b == null) {
                Context context = this.f33202a;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    YU.c("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    YU.c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f33203b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.f33203b;
        if (wakeLock == null) {
            return;
        }
        if (C2440Td0.g(z9, z10)) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void a() {
        PowerManager.WakeLock wakeLock = this.f33203b;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }
}
