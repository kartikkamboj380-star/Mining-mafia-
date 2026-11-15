package p089i8;

import android.content.SharedPreferences;
import io.invertase.firebase.app.a;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static o f45120b = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f45121a;

    private SharedPreferences a() {
        if (this.f45121a == null) {
            this.f45121a = a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f45121a;
    }

    public static o b() {
        return f45120b;
    }

    public String c(String str, String str2) {
        return a().getString(str, str2);
    }

    public SharedPreferences.Editor d(String str) {
        return a().edit().remove(str);
    }

    public void e(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }
}
