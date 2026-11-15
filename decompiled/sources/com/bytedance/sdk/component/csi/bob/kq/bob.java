package com.bytedance.sdk.component.csi.bob.kq;

import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bob<K, V> {
    private int bob;
    private int csi;
    private int fou;
    private final LinkedHashMap<K, SoftReference<V>> kq;
    private int oq;
    private int rhi;
    private int rjo;
    private int syt;

    public bob(int i10) {
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
        V v10;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.kq.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.rjo++;
                        return v10;
                    }
                    this.kq.remove(k10);
                } else {
                    v10 = null;
                }
                this.syt++;
                V vOq = oq(k10);
                if (vOq == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.csi++;
                        SoftReference<V> softReferencePut = this.kq.put(k10, new SoftReference<>(vOq));
                        if (softReferencePut != null) {
                            v10 = softReferencePut.get();
                        }
                        if (v10 != null) {
                            this.kq.put(k10, softReferencePut);
                        } else {
                            this.oq += bob(k10, vOq);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (v10 != null) {
                    return v10;
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
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.bob), Integer.valueOf(this.rjo), Integer.valueOf(this.syt), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    protected V oq(K k10) {
        return null;
    }

    public final V kq(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.fou++;
                    this.oq += bob(k10, v10);
                    SoftReference<V> softReferencePut = this.kq.put(k10, new SoftReference<>(v10));
                    if (softReferencePut != null) {
                        v11 = softReferencePut.get();
                        if (v11 != null) {
                            this.oq -= bob(k10, v11);
                        }
                    } else {
                        v11 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kq(this.bob);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void kq(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.oq < 0 || (this.kq.isEmpty() && this.oq != 0)) {
                        break;
                        break;
                    }
                    if (this.oq <= i10) {
                        return;
                    }
                    Map.Entry<K, SoftReference<V>> next = this.kq.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    K key = next.getKey();
                    SoftReference<V> value = next.getValue();
                    this.kq.remove(key);
                    if (value != null) {
                        this.oq -= bob(key, value.get());
                    }
                    this.rhi++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.oq + ", maxSize: " + i10);
        this.oq = 0;
        this.kq.clear();
    }
}
