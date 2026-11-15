package com.bytedance.adsdk.oq;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class suf<K, V> {
    private int bob;
    private int csi;
    private int fou;
    private final LinkedHashMap<K, V> kq;
    private int oq;
    private int rhi;
    private int rjo;
    private int syt;

    public suf(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.bob = i10;
        this.kq = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int bob(K k10, V v10) {
        int iOq = oq(k10, v10);
        if (iOq >= 0) {
            return iOq;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final V kq(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.kq.get(k10);
                if (v10 != null) {
                    this.rjo++;
                    return v10;
                }
                this.syt++;
                V vOq = oq(k10);
                if (vOq == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.csi++;
                        vPut = this.kq.put(k10, vOq);
                        if (vPut != null) {
                            this.kq.put(k10, vPut);
                        } else {
                            this.oq += bob(k10, vOq);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                kq(this.bob);
                return vOq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected int oq(K k10, V v10) {
        return 1;
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.rjo;
            i11 = this.syt + i10;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.bob), Integer.valueOf(this.rjo), Integer.valueOf(this.syt), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    protected V oq(K k10) {
        return null;
    }

    public final V kq(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.fou++;
                    this.oq += bob(k10, v10);
                    vPut = this.kq.put(k10, v10);
                    if (vPut != null) {
                        this.oq -= bob(k10, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kq(this.bob);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void kq(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.oq < 0 || (this.kq.isEmpty() && this.oq != 0)) {
                        break;
                    }
                    if (this.oq > i10 && !this.kq.isEmpty()) {
                        Map.Entry<K, V> next = this.kq.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.kq.remove(key);
                        this.oq -= bob(key, value);
                        this.rhi++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
