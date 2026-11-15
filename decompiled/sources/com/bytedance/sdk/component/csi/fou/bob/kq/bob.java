package com.bytedance.sdk.component.csi.fou.bob.kq;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bob<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> kq = new LinkedHashMap<>(0, 0.75f, true);
    private int oq;

    public bob(int i10) {
        this.oq = i10;
    }

    public synchronized V kq(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.oq <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.kq.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.kq.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.oq), Integer.valueOf(this.kq.size()));
    }

    public synchronized void kq(K k10, V v10) {
        if (this.oq <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.kq.put(k10, new SoftReference<>(v10));
        int size = this.kq.size();
        int i10 = this.oq;
        if (size > i10) {
            kq((int) (((double) i10) * 0.7d));
        }
    }

    public synchronized void kq(int i10) {
        int size = this.kq.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.kq.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.kq.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
