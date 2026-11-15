package p178r7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import p158p7.l;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f48356c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f48357a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f48358b = new ArrayList();

    private c() {
    }

    public static c e() {
        return f48356c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.f48358b);
    }

    public void b(l lVar) {
        this.f48357a.add(lVar);
    }

    public Collection c() {
        return Collections.unmodifiableCollection(this.f48357a);
    }

    public void d(l lVar) {
        boolean zG = g();
        this.f48357a.remove(lVar);
        this.f48358b.remove(lVar);
        if (!zG || g()) {
            return;
        }
        h.d().f();
    }

    public void f(l lVar) {
        boolean zG = g();
        this.f48358b.add(lVar);
        if (zG) {
            return;
        }
        h.d().e();
    }

    public boolean g() {
        return this.f48358b.size() > 0;
    }
}
