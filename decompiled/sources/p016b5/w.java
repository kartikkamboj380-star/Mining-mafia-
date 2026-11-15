package p016b5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p086i5.a;
import p086i5.e;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void H1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = J();
        e.c(parcelJ, vVar);
        e.b(parcelJ, googleSignInOptions);
        h0(103, parcelJ);
    }

    public final void N0(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = J();
        e.c(parcelJ, vVar);
        e.b(parcelJ, googleSignInOptions);
        h0(101, parcelJ);
    }

    public final void t1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = J();
        e.c(parcelJ, vVar);
        e.b(parcelJ, googleSignInOptions);
        h0(102, parcelJ);
    }
}
