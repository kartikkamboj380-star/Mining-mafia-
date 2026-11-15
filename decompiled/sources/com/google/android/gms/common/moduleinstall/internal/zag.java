package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zag extends com.google.android.gms.internal.base.b implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) com.google.android.gms.internal.base.c.a(parcel, ModuleInstallStatusUpdate.CREATOR);
        com.google.android.gms.internal.base.c.b(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
