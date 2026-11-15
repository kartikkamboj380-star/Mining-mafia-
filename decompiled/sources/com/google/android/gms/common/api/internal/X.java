package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class X implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f17026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zap f17027b;

    X(zap zapVar, V v10) {
        this.f17027b = zapVar;
        this.f17026a = v10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17027b.zaa) {
            ConnectionResult connectionResultB = this.f17026a.b();
            if (connectionResultB.hasResolution()) {
                zap zapVar = this.f17027b;
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultB.getResolution()), this.f17026a.a(), false), 1);
                return;
            }
            zap zapVar2 = this.f17027b;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), connectionResultB.getErrorCode(), null) != null) {
                zap zapVar3 = this.f17027b;
                zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, connectionResultB.getErrorCode(), 2, this.f17027b);
                return;
            }
            if (connectionResultB.getErrorCode() != 18) {
                this.f17027b.zaa(connectionResultB, this.f17026a.a());
                return;
            }
            zap zapVar4 = this.f17027b;
            Dialog dialogZab = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.f17027b;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new W(this, dialogZab));
        }
    }
}
