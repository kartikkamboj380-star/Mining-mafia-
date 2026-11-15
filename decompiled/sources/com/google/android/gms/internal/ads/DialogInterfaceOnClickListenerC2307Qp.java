package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC2307Qp implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2359Rp f22457a;

    DialogInterfaceOnClickListenerC2307Qp(C2359Rp c2359Rp) {
        Objects.requireNonNull(c2359Rp);
        this.f22457a = c2359Rp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f22457a.b("Operation denied by user.");
    }
}
