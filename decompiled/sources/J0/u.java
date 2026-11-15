package J0;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f1918c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1920b;

    public static class a extends u {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends u {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    u(String str, String str2) {
        this.f1919a = str;
        this.f1920b = str2;
        f1918c.add(this);
    }
}
