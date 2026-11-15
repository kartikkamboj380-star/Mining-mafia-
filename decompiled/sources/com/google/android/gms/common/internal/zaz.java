package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zaz extends com.google.android.gms.dynamic.c {
    private static final zaz zaa = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i10, int i11) throws com.google.android.gms.dynamic.c.a {
        zaz zazVar = zaa;
        try {
            return (View) com.google.android.gms.dynamic.b.h0(((zam) zazVar.getRemoteCreatorInstance(context)).zae(com.google.android.gms.dynamic.b.N0(context), new zax(1, i10, i11, null)));
        } catch (Exception e10) {
            throw new com.google.android.gms.dynamic.c.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zam(iBinder);
    }
}
