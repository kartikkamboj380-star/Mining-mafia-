package p109k8;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m f45712b = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f45713a;

    private SharedPreferences c() {
        if (this.f45713a == null) {
            this.f45713a = d.a().getSharedPreferences("io.invertase.googlemobileads", 0);
        }
        return this.f45713a;
    }

    public static m d() {
        return f45712b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            n.e(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public void e(String str, boolean z9) {
        c().edit().putBoolean(str, z9).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
