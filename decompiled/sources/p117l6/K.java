package p117l6;

import H6.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p087i6.g;
import p127m6.i;
import p176r5.AbstractC7096m;

/* JADX INFO: loaded from: classes3.dex */
public class K implements L {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f46117g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f46118h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f46119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f46120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f46122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f46123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L.a f46124f;

    public K(Context context, String str, e eVar, F f10) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f46120b = context;
        this.f46121c = str;
        this.f46122d = eVar;
        this.f46123e = f10;
        this.f46119a = new M();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f46117g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f46118h, "");
    }

    private boolean n() {
        L.a aVar = this.f46124f;
        if (aVar != null) {
            return aVar.e() == null && this.f46123e.d();
        }
        return true;
    }

    @Override // p117l6.L
    public synchronized L.a a() {
        if (!n()) {
            return this.f46124f;
        }
        g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = AbstractC7048i.q(this.f46120b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f46123e.d()) {
            J jD = d(false);
            g.f().i("Fetched Firebase Installation ID: " + jD.b());
            if (jD.b() == null) {
                jD = new J(string == null ? c() : string, null);
            }
            if (Objects.equals(jD.b(), string)) {
                this.f46124f = L.a.a(l(sharedPreferencesQ), jD);
            } else {
                this.f46124f = L.a.a(b(jD.b(), sharedPreferencesQ), jD);
            }
        } else if (k(string)) {
            this.f46124f = L.a.b(l(sharedPreferencesQ));
        } else {
            this.f46124f = L.a.b(b(c(), sharedPreferencesQ));
        }
        g.f().i("Install IDs: " + this.f46124f);
        return this.f46124f;
    }

    public J d(boolean z9) {
        String strB;
        i.e();
        String str = null;
        if (z9) {
            try {
                strB = ((com.google.firebase.installations.g) AbstractC7096m.b(this.f46122d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                g.f().l("Error getting Firebase authentication token.", e10);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) AbstractC7096m.b(this.f46122d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            g.f().l("Error getting Firebase installation id.", e11);
        }
        return new J(str, strB);
    }

    public String f() {
        return this.f46121c;
    }

    public String g() {
        return this.f46119a.a(this.f46120b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
