package p158p7;

import p208u7.g;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47956b;

    private k(String str, String str2) {
        this.f47955a = str;
        this.f47956b = str2;
    }

    public static k a(String str, String str2) {
        g.d(str, "Name is null or empty");
        g.d(str2, "Version is null or empty");
        return new k(str, str2);
    }

    public String b() {
        return this.f47955a;
    }

    public String c() {
        return this.f47956b;
    }
}
