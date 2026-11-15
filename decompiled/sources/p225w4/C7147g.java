package p225w4;

import p165q4.b;
import p165q4.d;

/* JADX INFO: renamed from: w4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7147g implements b {

    /* JADX INFO: renamed from: w4.g$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C7147g f50329a = new C7147g();
    }

    public static C7147g a() {
        return a.f50329a;
    }

    public static String b() {
        return (String) d.d(AbstractC7146f.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
