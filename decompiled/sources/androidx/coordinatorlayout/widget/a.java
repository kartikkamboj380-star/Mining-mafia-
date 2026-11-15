package androidx.coordinatorlayout.widget;

import N.d;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p190t.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f9099a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f9100b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f9101c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f9102d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f9100b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f9099a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f9099a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f9100b.containsKey(obj) || !this.f9100b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f9100b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f9100b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f9100b.containsKey(obj)) {
            return;
        }
        this.f9100b.put(obj, null);
    }

    public void c() {
        int size = this.f9100b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f9100b.k(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f9100b.clear();
    }

    public boolean d(Object obj) {
        return this.f9100b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList arrayListH = h(obj);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList h(Object obj) {
        return (ArrayList) this.f9100b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f9100b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f9100b.k(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f9100b.g(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f9101c.clear();
        this.f9102d.clear();
        int size = this.f9100b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f9100b.g(i10), this.f9101c, this.f9102d);
        }
        return this.f9101c;
    }

    public boolean k(Object obj) {
        int size = this.f9100b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f9100b.k(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
