package D6;

import p057f6.D;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f479b;

    public a(Class cls, Object obj) {
        this.f478a = (Class) D.b(cls);
        this.f479b = D.b(obj);
    }

    public Object a() {
        return this.f479b;
    }

    public Class b() {
        return this.f478a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f478a, this.f479b);
    }
}
