package p016b5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p086i5.c;
import p086i5.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends c implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p086i5.c
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) e.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) e.a(parcel, Status.CREATOR);
                e.d(parcel);
                z1(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) e.a(parcel, Status.CREATOR);
                e.d(parcel);
                q5(status2);
                break;
            case 103:
                Status status3 = (Status) e.a(parcel, Status.CREATOR);
                e.d(parcel);
                K5(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
