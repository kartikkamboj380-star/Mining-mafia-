package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Objects;
import p136n5.w;

/* JADX INFO: loaded from: classes.dex */
final class c implements p126m5.a.InterfaceC0472a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f39985a;

    public c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f39985a = dVar;
    }

    @Override // p136n5.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f39985a;
        if (dVar.f39986a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = b.f39984g;
            String strA = w.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            dVar.a().a(2, bundle2);
        }
    }
}
