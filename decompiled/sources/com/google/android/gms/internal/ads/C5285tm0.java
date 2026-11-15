package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5285tm0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MotionEvent f33484b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f33483a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C5033rm0 f33485c = new C5033rm0();

    C5285tm0() {
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.f33484b = MotionEvent.obtain(motionEvent);
            }
            this.f33485c.a(motionEvent);
            ArrayDeque arrayDeque = this.f33483a;
            if (arrayDeque.size() >= 6) {
                arrayDeque.remove();
            }
            arrayDeque.add(new C5159sm0(motionEvent));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        try {
            MotionEvent motionEvent = this.f33484b;
            if (motionEvent != null) {
                map.put("nv", motionEvent);
            }
            map.put("oe", this.f33485c);
            ArrayDeque arrayDeque = this.f33483a;
            map.put("ro", arrayDeque.toArray(new C5159sm0[arrayDeque.size()]));
            this.f33485c = new C5033rm0();
            arrayDeque.clear();
            MotionEvent motionEvent2 = this.f33484b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.f33484b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
