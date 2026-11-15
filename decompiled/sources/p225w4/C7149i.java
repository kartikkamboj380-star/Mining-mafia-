package p225w4;

import p165q4.b;

/* JADX INFO: renamed from: w4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7149i implements b {

    /* JADX INFO: renamed from: w4.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C7149i f50331a = new C7149i();
    }

    public static C7149i a() {
        return a.f50331a;
    }

    public static int c() {
        return AbstractC7146f.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
