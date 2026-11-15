package com.google.android.gms.signin.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends com.google.android.gms.internal.base.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 8:
                l lVar = (l) com.google.android.gms.internal.base.c.a(parcel, l.CREATOR);
                com.google.android.gms.internal.base.c.b(parcel);
                zab(lVar);
                break;
            case 9:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
