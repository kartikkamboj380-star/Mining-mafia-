package p089i8;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f45117b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f45118a;

    private SharedPreferences e() {
        if (this.f45118a == null) {
            this.f45118a = a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f45118a;
    }

    public static k f() {
        return f45117b;
    }

    public void a() {
        e().edit().clear().apply();
    }

    public boolean b(String str) {
        return e().contains(str);
    }

    public WritableMap c() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : e().getAll().entrySet()) {
            m.g(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public boolean d(String str, boolean z9) {
        return e().getBoolean(str, z9);
    }

    public void g(String str, boolean z9) {
        e().edit().putBoolean(str, z9).apply();
    }

    public void h(String str, String str2) {
        e().edit().putString(str, str2).apply();
    }
}
