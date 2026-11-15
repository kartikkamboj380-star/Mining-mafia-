package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture f40046h;

    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.r(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.q(obj);
        }
    }

    interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f40046h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void d() {
        this.f40046h.cancel(t());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f40046h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f40046h.compareTo(delayed);
    }
}
