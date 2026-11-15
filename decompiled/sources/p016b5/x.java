package p016b5;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.common.util.UidVerifier;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11619a;

    public x(Context context) {
        this.f11619a = context;
    }

    private final void h0() {
        if (UidVerifier.isGooglePlayServicesUid(this.f11619a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // p016b5.t
    public final void Y0() {
        h0();
        Context context = this.f11619a;
        c cVarB = c.b(context);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f16937l;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        b bVarA = a.a(context, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.e();
        } else {
            bVarA.f();
        }
    }

    @Override // p016b5.t
    public final void s1() {
        h0();
        r.a(this.f11619a).b();
    }
}
