package p016b5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f11597c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f11598d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f11599a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f11600b;

    c(Context context) {
        this.f11600b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        Preconditions.checkNotNull(context);
        f11597c.lock();
        try {
            if (f11598d == null) {
                f11598d = new c(context.getApplicationContext());
            }
            return f11598d;
        } finally {
            f11597c.unlock();
        }
    }

    private static final String k(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f11599a.lock();
        try {
            this.f11600b.edit().clear().apply();
        } finally {
            this.f11599a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(k("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.V0(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(k("googleSignInOptions", strG2))) != null) {
            try {
                return GoogleSignInOptions.W(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.g1());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strG1 = googleSignInAccount.g1();
        j(k("googleSignInAccount", strG1), googleSignInAccount.l1());
        j(k("googleSignInOptions", strG1), googleSignInOptions.V0());
    }

    protected final String g(String str) {
        this.f11599a.lock();
        try {
            return this.f11600b.getString(str, null);
        } finally {
            this.f11599a.unlock();
        }
    }

    protected final void h(String str) {
        this.f11599a.lock();
        try {
            this.f11600b.edit().remove(str).apply();
        } finally {
            this.f11599a.unlock();
        }
    }

    public final void i() {
        String strG = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        h(k("googleSignInAccount", strG));
        h(k("googleSignInOptions", strG));
    }

    protected final void j(String str, String str2) {
        this.f11599a.lock();
        try {
            this.f11600b.edit().putString(str, str2).apply();
        } finally {
            this.f11599a.unlock();
        }
    }
}
