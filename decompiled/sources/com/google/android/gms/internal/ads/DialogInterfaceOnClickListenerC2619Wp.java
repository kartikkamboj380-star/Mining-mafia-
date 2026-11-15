package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC2619Wp implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2671Xp f24874a;

    DialogInterfaceOnClickListenerC2619Wp(C2671Xp c2671Xp) {
        Objects.requireNonNull(c2671Xp);
        this.f24874a = c2671Xp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f24874a.b("User canceled the download.");
    }
}
