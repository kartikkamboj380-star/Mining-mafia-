package p057f6;

import G6.b;

/* JADX INFO: loaded from: classes2.dex */
public class w implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f43731c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f43732a = f43731c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f43733b;

    public w(b bVar) {
        this.f43733b = bVar;
    }

    @Override // G6.b
    public Object get() {
        Object obj;
        Object obj2 = this.f43732a;
        Object obj3 = f43731c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f43732a;
                if (obj == obj3) {
                    obj = this.f43733b.get();
                    this.f43732a = obj;
                    this.f43733b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
