package H2;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: H2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0579d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f1137b;

    public C0579d(int i10) {
        this.f1136a = i10;
        this.f1137b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f1137b.size() == this.f1136a) {
                LinkedHashSet linkedHashSet = this.f1137b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f1137b.remove(obj);
        } catch (Throwable th) {
            throw th;
        }
        return this.f1137b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f1137b.contains(obj);
    }
}
