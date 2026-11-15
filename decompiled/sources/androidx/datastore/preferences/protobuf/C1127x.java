package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1127x implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f9704a;

    public C1127x(Iterator it) {
        this.f9704a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f9704a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9704a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f9704a.remove();
    }
}
