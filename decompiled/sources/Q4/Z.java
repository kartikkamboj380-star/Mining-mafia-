package Q4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f4880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f4882d = new Object();

    Z(Context context) {
        this.f4881c = context;
    }

    private final void k() {
        synchronized (this.f4882d) {
            try {
                if (this.f4879a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f4881c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f4879a = sharedPreferences;
                this.f4880b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, String str2) {
        k();
        synchronized (this.f4882d) {
            this.f4880b.putString(str, str2).commit();
        }
    }

    public final String b(String str) {
        String string;
        k();
        synchronized (this.f4882d) {
            string = this.f4879a.getString(str, null);
            this.f4880b.remove(str).commit();
        }
        return string;
    }

    public final boolean c(String str) {
        boolean zContains;
        k();
        synchronized (this.f4882d) {
            zContains = this.f4879a.contains(str);
        }
        return zContains;
    }

    public final void d(String str, int i10, String str2, int i11) {
        k();
        synchronized (this.f4882d) {
            this.f4880b.putString("pn", str).putInt("vc", i10).putString("dm", str2).putInt("aav", i11).commit();
        }
    }

    public final String e() {
        String string;
        k();
        synchronized (this.f4882d) {
            string = this.f4879a.getString("pn", null);
        }
        return string;
    }

    public final int f() {
        int i10;
        k();
        synchronized (this.f4882d) {
            i10 = this.f4879a.getInt("vc", -1);
        }
        return i10;
    }

    public final String g() {
        String string;
        k();
        synchronized (this.f4882d) {
            string = this.f4879a.getString("dm", null);
        }
        return string;
    }

    public final int h() {
        int i10;
        k();
        synchronized (this.f4882d) {
            i10 = this.f4879a.getInt("aav", -1);
        }
        return i10;
    }

    public final void i() {
        k();
        synchronized (this.f4882d) {
            this.f4880b.clear().commit();
        }
    }

    public final Map j() {
        HashMap map;
        k();
        synchronized (this.f4882d) {
            try {
                Map<String, ?> all = this.f4879a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
