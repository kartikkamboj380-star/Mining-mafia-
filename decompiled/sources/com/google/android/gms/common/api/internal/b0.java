package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
final class b0 implements zabz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1421b f17045a;

    /* synthetic */ b0(C1421b c1421b, zaw zawVar) {
        this.f17045a = c1421b;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        this.f17045a.f17043m.lock();
        try {
            this.f17045a.f17040j = connectionResult;
            C1421b.p(this.f17045a);
        } finally {
            this.f17045a.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.f17045a.f17043m.lock();
        try {
            C1421b.o(this.f17045a, bundle);
            this.f17045a.f17040j = ConnectionResult.RESULT_SUCCESS;
            C1421b.p(this.f17045a);
        } finally {
            this.f17045a.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z9) {
        this.f17045a.f17043m.lock();
        try {
            C1421b c1421b = this.f17045a;
            if (c1421b.f17042l || c1421b.f17041k == null || !c1421b.f17041k.isSuccess()) {
                this.f17045a.f17042l = false;
                C1421b.n(this.f17045a, i10, z9);
            } else {
                this.f17045a.f17042l = true;
                this.f17045a.f17035e.onConnectionSuspended(i10);
            }
        } finally {
            this.f17045a.f17043m.unlock();
        }
    }
}
