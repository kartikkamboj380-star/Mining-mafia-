package u9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f50058d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f50059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    q f50060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f50061c;

    private j(Object obj, q qVar) {
        this.f50059a = obj;
        this.f50060b = qVar;
    }

    static j a(q qVar, Object obj) {
        List list = f50058d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new j(obj, qVar);
                }
                j jVar = (j) list.remove(size - 1);
                jVar.f50059a = obj;
                jVar.f50060b = qVar;
                jVar.f50061c = null;
                return jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void b(j jVar) {
        jVar.f50059a = null;
        jVar.f50060b = null;
        jVar.f50061c = null;
        List list = f50058d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
