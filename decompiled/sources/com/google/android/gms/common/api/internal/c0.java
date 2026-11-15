package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
final class c0 implements zabz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1421b f17048a;

    /* synthetic */ c0(C1421b c1421b, zay zayVar) {
        this.f17048a = c1421b;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        this.f17048a.f17043m.lock();
        try {
            this.f17048a.f17041k = connectionResult;
            C1421b.p(this.f17048a);
        } finally {
            this.f17048a.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.f17048a.f17043m.lock();
        try {
            this.f17048a.f17041k = ConnectionResult.RESULT_SUCCESS;
            C1421b.p(this.f17048a);
        } finally {
            this.f17048a.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z9) {
        this.f17048a.f17043m.lock();
        try {
            C1421b c1421b = this.f17048a;
            if (c1421b.f17042l) {
                c1421b.f17042l = false;
                C1421b.n(this.f17048a, i10, z9);
            } else {
                c1421b.f17042l = true;
                this.f17048a.f17034d.onConnectionSuspended(i10);
            }
        } finally {
            this.f17048a.f17043m.unlock();
        }
    }
}
