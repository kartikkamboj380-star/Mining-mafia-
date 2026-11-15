package p065g4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44391a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f44392b;

    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* JADX INFO: renamed from: g4.b$b, reason: collision with other inner class name */
    private static final class C0430b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f44393a;

        public C0430b(long j10) {
            this.f44393a = j10;
        }

        @Override // g4.b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // g4.b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // g4.b.a
        public void c() {
            p065g4.a.i(this.f44393a);
        }
    }

    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f44394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f44395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f44396c;

        public c(long j10, String sectionName) {
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            this.f44394a = j10;
            this.f44395b = sectionName;
            this.f44396c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f44396c.add(str + ": " + str2);
        }

        @Override // g4.b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            d(key, String.valueOf(i10));
            return this;
        }

        @Override // g4.b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // g4.b.a
        public void c() {
            String str;
            long j10 = this.f44394a;
            String str2 = this.f44395b;
            if (!b.f44392b || this.f44396c.isEmpty()) {
                str = "";
            } else {
                str = " (" + p065g4.c.a(", ", this.f44396c) + ")";
            }
            p065g4.a.c(j10, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new c(j10, sectionName);
    }

    public static final a b(long j10) {
        return new C0430b(j10);
    }
}
