package com.bytedance.sdk.component.kq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class sns<K, V> {
    private final Map<K, V> kq = new HashMap();
    private final Map<V, Set<K>> oq = new HashMap();

    public void kq(Set<K> set, V v10) {
        for (K k10 : set) {
            if (this.kq.containsKey(k10)) {
                oq(k10);
            }
        }
        Set<K> hashSet = this.oq.get(v10);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.oq.put(v10, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.kq.put(it.next(), v10);
        }
    }

    public void oq(K k10) {
        Set<K> set;
        V vRemove = this.kq.remove(k10);
        if (vRemove == null || (set = this.oq.get(vRemove)) == null) {
            return;
        }
        set.remove(k10);
        if (set.isEmpty()) {
            this.oq.remove(vRemove);
        }
    }

    public V kq(K k10) {
        return this.kq.get(k10);
    }

    public void kq() {
        this.kq.clear();
        this.oq.clear();
    }
}
