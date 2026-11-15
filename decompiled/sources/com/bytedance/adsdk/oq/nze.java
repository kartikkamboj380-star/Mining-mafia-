package com.bytedance.adsdk.oq;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class nze<K, V> {
    nze<K, V>.oq oq;

    final class kq<T> implements Iterator<T> {
        int bob;
        boolean fou = false;
        final int kq;
        int oq;

        kq(int i10) {
            this.kq = i10;
            this.oq = nze.this.kq();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.bob < this.oq;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) nze.this.kq(this.bob, this.kq);
            this.bob++;
            this.fou = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.fou) {
                throw new IllegalStateException();
            }
            int i10 = this.bob - 1;
            this.bob = i10;
            this.oq--;
            this.fou = false;
            nze.this.kq(i10);
        }
    }

    final class oq implements Set<K> {
        oq() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            nze.this.bob();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return nze.this.kq(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return nze.kq(nze.this.oq(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return nze.kq(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iKq = nze.this.kq() - 1; iKq >= 0; iKq--) {
                Object objKq = nze.this.kq(iKq, 0);
                iHashCode += objKq == null ? 0 : objKq.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return nze.this.kq() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new kq(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iKq = nze.this.kq(obj);
            if (iKq < 0) {
                return false;
            }
            nze.this.kq(iKq);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return nze.oq(nze.this.oq(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return nze.bob(nze.this.oq(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return nze.this.kq();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return nze.this.oq(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) nze.this.kq(tArr, 0);
        }
    }

    nze() {
    }

    public static <K, V> boolean bob(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean kq(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean oq(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    protected abstract void bob();

    public Set<K> fou() {
        if (this.oq == null) {
            this.oq = new oq();
        }
        return this.oq;
    }

    protected abstract int kq();

    protected abstract int kq(Object obj);

    protected abstract Object kq(int i10, int i11);

    protected abstract void kq(int i10);

    protected abstract Map<K, V> oq();

    public <T> T[] kq(T[] tArr, int i10) {
        int iKq = kq();
        if (tArr.length < iKq) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iKq));
        }
        for (int i11 = 0; i11 < iKq; i11++) {
            tArr[i11] = kq(i11, i10);
        }
        if (tArr.length > iKq) {
            tArr[iKq] = null;
        }
        return tArr;
    }

    public Object[] oq(int i10) {
        int iKq = kq();
        Object[] objArr = new Object[iKq];
        for (int i11 = 0; i11 < iKq; i11++) {
            objArr[i11] = kq(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean kq(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
