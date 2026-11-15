package J0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: J0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0708a implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f1905c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1907b;

    /* JADX INFO: renamed from: J0.a$a, reason: collision with other inner class name */
    private static class C0031a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set f1908a = new HashSet(Arrays.asList(C.d().a()));
    }

    /* JADX INFO: renamed from: J0.a$b */
    public static class b extends AbstractC0708a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: J0.a$c */
    public static class c extends AbstractC0708a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: J0.a$d */
    public static class d extends AbstractC0708a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: renamed from: J0.a$e */
    public static class e extends AbstractC0708a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: J0.a$f */
    public static class f extends AbstractC0708a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: J0.a$g */
    public static class g extends AbstractC0708a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: J0.a$h */
    public static class h extends AbstractC0708a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: J0.a$i */
    public static class i extends AbstractC0708a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // J0.AbstractC0708a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC0708a(String str, String str2) {
        this.f1906a = str;
        this.f1907b = str2;
        f1905c.add(this);
    }

    public static Set d() {
        return Collections.unmodifiableSet(f1905c);
    }

    @Override // J0.m
    public String a() {
        return this.f1906a;
    }

    public abstract boolean b();

    public boolean c() {
        return t9.a.b(C0031a.f1908a, this.f1907b);
    }

    @Override // J0.m
    public boolean isSupported() {
        return b() || c();
    }
}
