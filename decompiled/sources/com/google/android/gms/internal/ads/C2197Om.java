package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2197Om implements InitializationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21667a;

    public C2197Om(Map map) {
        this.f21667a = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        return this.f21667a;
    }
}
