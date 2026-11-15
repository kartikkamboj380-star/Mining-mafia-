package X6;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6752a;

    private g() {
        this.f6752a = null;
    }

    public static g a() {
        return new g();
    }

    public static g b(Object obj) {
        return obj == null ? a() : e(obj);
    }

    public static g e(Object obj) {
        return new g(obj);
    }

    public Object c() {
        Object obj = this.f6752a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f6752a != null;
    }

    private g(Object obj) {
        if (obj != null) {
            this.f6752a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
