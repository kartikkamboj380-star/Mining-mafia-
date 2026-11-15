package p016b5;

import android.os.Parcel;
import p086i5.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p086i5.c
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Y0();
        } else {
            if (i10 != 2) {
                return false;
            }
            s1();
        }
        return true;
    }
}
