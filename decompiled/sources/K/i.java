package K;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f2392b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f2393a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f2394a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f2393a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return i(b.b());
    }

    public static i e() {
        return f2392b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f2393a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f2393a.equals(((i) obj).f2393a);
    }

    public boolean f() {
        return this.f2393a.isEmpty();
    }

    public int g() {
        return this.f2393a.size();
    }

    public String h() {
        return this.f2393a.a();
    }

    public int hashCode() {
        return this.f2393a.hashCode();
    }

    public String toString() {
        return this.f2393a.toString();
    }
}
