package com.bytedance.adsdk.oq;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kq<E> implements Collection<E>, Set<E> {
    private static Object[] csi;
    private static int rhi;
    private static Object[] rjo;
    private static int syt;
    private int[] dgq;
    Object[] kq;
    private nze<E, E> nn;
    int oq;
    private static final int[] bob = new int[0];
    private static final Object[] fou = new Object[0];

    public kq() {
        this(0);
    }

    private void fou(int i10) {
        if (i10 == 8) {
            synchronized (kq.class) {
                Object[] objArr = rjo;
                if (objArr != null) {
                    this.kq = objArr;
                    rjo = (Object[]) objArr[0];
                    this.dgq = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    syt--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (kq.class) {
                Object[] objArr2 = csi;
                if (objArr2 != null) {
                    this.kq = objArr2;
                    csi = (Object[]) objArr2[0];
                    this.dgq = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    rhi--;
                    return;
                }
            }
        }
        this.dgq = new int[i10];
        this.kq = new Object[i10];
    }

    private int kq(Object obj, int i10) {
        int i11 = this.oq;
        if (i11 == 0) {
            return -1;
        }
        int iKq = oq.kq(this.dgq, i11, i10);
        if (iKq < 0 || obj.equals(this.kq[iKq])) {
            return iKq;
        }
        int i12 = iKq + 1;
        while (i12 < i11 && this.dgq[i12] == i10) {
            if (obj.equals(this.kq[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iKq - 1; i13 >= 0 && this.dgq[i13] == i10; i13--) {
            if (obj.equals(this.kq[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iKq;
        if (e10 == null) {
            iKq = kq();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iKq = kq(e10, iHashCode);
        }
        if (iKq >= 0) {
            return false;
        }
        int i11 = ~iKq;
        int i12 = this.oq;
        int[] iArr = this.dgq;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.kq;
            fou(i13);
            int[] iArr2 = this.dgq;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.kq, 0, objArr.length);
            }
            kq(iArr, objArr, this.oq);
        }
        int i14 = this.oq;
        if (i11 < i14) {
            int[] iArr3 = this.dgq;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.kq;
            System.arraycopy(objArr2, i11, objArr2, i15, this.oq - i11);
        }
        this.dgq[i11] = i10;
        this.kq[i11] = e10;
        this.oq++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        kq(this.oq + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public E bob(int i10) {
        Object[] objArr = this.kq;
        E e10 = (E) objArr[i10];
        int i11 = this.oq;
        if (i11 <= 1) {
            kq(this.dgq, objArr, i11);
            this.dgq = bob;
            this.kq = fou;
            this.oq = 0;
            return e10;
        }
        int[] iArr = this.dgq;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.oq = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.kq;
                System.arraycopy(objArr2, i13, objArr2, i10, this.oq - i10);
            }
            this.kq[this.oq] = null;
            return e10;
        }
        fou(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.oq--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.dgq, 0, i10);
            System.arraycopy(objArr, 0, this.kq, 0, i10);
        }
        int i14 = this.oq;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.dgq, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.kq, i10, this.oq - i10);
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.oq;
        if (i10 != 0) {
            kq(this.dgq, this.kq, i10);
            this.dgq = bob;
            this.kq = fou;
            this.oq = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return kq(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.oq; i10++) {
                try {
                    if (!set.contains(oq(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.dgq;
        int i10 = this.oq;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.oq <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return oq().fou().iterator();
    }

    public E oq(int i10) {
        return (E) this.kq[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iKq = kq(obj);
        if (iKq < 0) {
            return false;
        }
        bob(iKq);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z9 = false;
        for (int i10 = this.oq - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.kq[i10])) {
                bob(i10);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.oq;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.oq;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.kq, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.oq * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.oq; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            E eOq = oq(i10);
            if (eOq != this) {
                sb.append(eOq);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public kq(int i10) {
        if (i10 == 0) {
            this.dgq = bob;
            this.kq = fou;
        } else {
            fou(i10);
        }
        this.oq = 0;
    }

    private nze<E, E> oq() {
        if (this.nn == null) {
            this.nn = new nze<E, E>() { // from class: com.bytedance.adsdk.oq.kq.1
                @Override // com.bytedance.adsdk.oq.nze
                protected void bob() {
                    kq.this.clear();
                }

                @Override // com.bytedance.adsdk.oq.nze
                protected int kq() {
                    return kq.this.oq;
                }

                @Override // com.bytedance.adsdk.oq.nze
                protected Map<E, E> oq() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.oq.nze
                protected Object kq(int i10, int i11) {
                    return kq.this.kq[i10];
                }

                @Override // com.bytedance.adsdk.oq.nze
                protected int kq(Object obj) {
                    return kq.this.kq(obj);
                }

                @Override // com.bytedance.adsdk.oq.nze
                protected void kq(int i10) {
                    kq.this.bob(i10);
                }
            };
        }
        return this.nn;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.oq) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.oq));
        }
        System.arraycopy(this.kq, 0, tArr, 0, this.oq);
        int length = tArr.length;
        int i10 = this.oq;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int kq() {
        int i10 = this.oq;
        if (i10 == 0) {
            return -1;
        }
        int iKq = oq.kq(this.dgq, i10, 0);
        if (iKq < 0 || this.kq[iKq] == null) {
            return iKq;
        }
        int i11 = iKq + 1;
        while (i11 < i10 && this.dgq[i11] == 0) {
            if (this.kq[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iKq - 1; i12 >= 0 && this.dgq[i12] == 0; i12--) {
            if (this.kq[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void kq(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (kq.class) {
                try {
                    if (syt < 10) {
                        objArr[0] = rjo;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        rjo = objArr;
                        syt++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (kq.class) {
                try {
                    if (rhi < 10) {
                        objArr[0] = csi;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        csi = objArr;
                        rhi++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void kq(int i10) {
        int[] iArr = this.dgq;
        if (iArr.length < i10) {
            Object[] objArr = this.kq;
            fou(i10);
            int i11 = this.oq;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.dgq, 0, i11);
                System.arraycopy(objArr, 0, this.kq, 0, this.oq);
            }
            kq(iArr, objArr, this.oq);
        }
    }

    public int kq(Object obj) {
        return obj == null ? kq() : kq(obj, obj.hashCode());
    }
}
