package com.facebook.react.fabric;

import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f14844a = new PriorityQueue(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f14845b = new PriorityQueue(11, p159p8.a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f14846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f14848e;

    public final void a(long j10) {
        double d10;
        if (j10 != 0) {
            if (this.f14844a.size() == this.f14845b.size()) {
                this.f14845b.offer(Long.valueOf(j10));
                this.f14844a.offer(this.f14845b.poll());
            } else {
                this.f14844a.offer(Long.valueOf(j10));
                this.f14845b.offer(this.f14844a.poll());
            }
        }
        int i10 = this.f14847d;
        int i11 = i10 + 1;
        this.f14847d = i11;
        if (i11 == 1) {
            d10 = j10;
        } else {
            d10 = (j10 / ((long) i11)) + (this.f14846c / ((double) (i11 / i10)));
        }
        this.f14846c = d10;
        long j11 = this.f14848e;
        if (j10 <= j11) {
            j10 = j11;
        }
        this.f14848e = j10;
    }

    public final double b() {
        return this.f14846c;
    }

    public final long c() {
        return this.f14848e;
    }

    public final double d() {
        long jLongValue;
        Long lValueOf;
        if (this.f14844a.size() == 0 && this.f14845b.size() == 0) {
            return 0.0d;
        }
        if (this.f14844a.size() > this.f14845b.size()) {
            lValueOf = (Long) this.f14844a.peek();
        } else {
            Long l10 = (Long) this.f14844a.peek();
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                Object objPeek = this.f14845b.peek();
                Intrinsics.c(objPeek);
                jLongValue = ((Number) objPeek).longValue();
            }
            lValueOf = Long.valueOf(jLongValue / ((long) 2));
        }
        return lValueOf.longValue();
    }
}
