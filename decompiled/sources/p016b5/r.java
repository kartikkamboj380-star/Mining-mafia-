package p016b5;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f11615d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f11616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f11618c;

    private r(Context context) {
        c cVarB = c.b(context);
        this.f11616a = cVarB;
        this.f11617b = cVarB.c();
        this.f11618c = cVarB.d();
    }

    public static synchronized r a(Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized r f(Context context) {
        r rVar = f11615d;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context);
        f11615d = rVar2;
        return rVar2;
    }

    public final synchronized void b() {
        this.f11616a.a();
        this.f11617b = null;
        this.f11618c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f11616a.f(googleSignInAccount, googleSignInOptions);
        this.f11617b = googleSignInAccount;
        this.f11618c = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount d() {
        return this.f11617b;
    }

    public final synchronized GoogleSignInOptions e() {
        return this.f11618c;
    }
}
