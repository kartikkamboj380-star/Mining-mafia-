package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U f9430c = new U();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f9431d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f9433b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f9432a = new B();

    private U() {
    }

    public static U a() {
        return f9430c;
    }

    public Y b(Class cls, Y y9) {
        AbstractC1124u.b(cls, "messageType");
        AbstractC1124u.b(y9, "schema");
        return (Y) this.f9433b.putIfAbsent(cls, y9);
    }

    public Y c(Class cls) {
        Y yB;
        AbstractC1124u.b(cls, "messageType");
        Y yA = (Y) this.f9433b.get(cls);
        return (yA != null || (yB = b(cls, (yA = this.f9432a.a(cls)))) == null) ? yA : yB;
    }

    public Y d(Object obj) {
        return c(obj.getClass());
    }
}
