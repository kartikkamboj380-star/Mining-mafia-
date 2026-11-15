package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class T50 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ T50 f23410a = new T50();

    private /* synthetic */ T50() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", G4.t.l().o());
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Qf)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoZ = G4.t.l().z();
            if (memoryInfoZ != null) {
                if (PlatformVersion.isAtLeastU()) {
                    bundle.putLong("a_ad_mem", memoryInfoZ.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoZ.totalMem);
                bundle.putLong("a_avai", memoryInfoZ.availMem);
                bundle.putLong("a_threshold", memoryInfoZ.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoZ.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new V50(bundle);
    }
}
