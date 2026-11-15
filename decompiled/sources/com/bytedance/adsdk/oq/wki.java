package com.bytedance.adsdk.oq;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class wki<T> {
    public static Executor kq = Executors.newCachedThreadPool();
    private final Set<ubx<Throwable>> bob;
    private volatile vvw<T> csi;
    private final Handler fou;
    private final Set<ubx<T>> oq;

    private class kq extends FutureTask<vvw<T>> {
        kq(Callable<vvw<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                wki.this.kq((vvw) get());
            } catch (InterruptedException | ExecutionException e10) {
                wki.this.kq(new vvw(e10));
            }
        }
    }

    public wki(Callable<vvw<T>> callable) {
        this(callable, false);
    }

    public synchronized wki<T> bob(ubx<Throwable> ubxVar) {
        try {
            vvw<T> vvwVar = this.csi;
            if (vvwVar != null && vvwVar.oq() != null) {
                ubxVar.kq(vvwVar.oq());
            }
            this.bob.add(ubxVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized wki<T> fou(ubx<Throwable> ubxVar) {
        this.bob.remove(ubxVar);
        return this;
    }

    public synchronized wki<T> oq(ubx<T> ubxVar) {
        this.oq.remove(ubxVar);
        return this;
    }

    wki(Callable<vvw<T>> callable, boolean z9) {
        this.oq = new LinkedHashSet(1);
        this.bob = new LinkedHashSet(1);
        this.fou = new Handler(Looper.getMainLooper());
        this.csi = null;
        if (!z9) {
            kq.execute(new kq(callable));
            return;
        }
        try {
            kq((vvw) callable.call());
        } catch (Throwable th) {
            kq((vvw) new vvw<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(vvw<T> vvwVar) {
        if (this.csi == null) {
            this.csi = vvwVar;
            kq();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized wki<T> kq(ubx<T> ubxVar) {
        try {
            vvw<T> vvwVar = this.csi;
            if (vvwVar != null && vvwVar.kq() != null) {
                ubxVar.kq(vvwVar.kq());
            }
            this.oq.add(ubxVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void kq() {
        this.fou.post(new Runnable() { // from class: com.bytedance.adsdk.oq.wki.1
            @Override // java.lang.Runnable
            public void run() {
                vvw vvwVar = wki.this.csi;
                if (vvwVar == null) {
                    return;
                }
                if (vvwVar.kq() != null) {
                    wki.this.kq(vvwVar.kq());
                } else {
                    wki.this.kq(vvwVar.oq());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kq(T t10) {
        ArrayList arrayList = new ArrayList(this.oq);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ubx) obj).kq(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kq(Throwable th) {
        ArrayList arrayList = new ArrayList(this.bob);
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ubx) obj).kq(th);
        }
    }
}
