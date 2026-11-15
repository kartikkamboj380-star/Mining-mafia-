package v9;

import u9.g;
import u9.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f50224c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f50225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f50226b;

    static {
        f50224c = b.c() ? b.b() : null;
    }

    public a(g gVar, h hVar) {
        this.f50225a = gVar;
        this.f50226b = hVar;
    }

    public static boolean a() {
        return f50224c != null;
    }

    public static a b() {
        return f50224c;
    }
}
