package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class e implements p126m5.a.InterfaceC0472a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f39990a;

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f39990a = fVar;
    }

    @Override // p136n5.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f39990a.a().a(3, bundle2);
    }
}
