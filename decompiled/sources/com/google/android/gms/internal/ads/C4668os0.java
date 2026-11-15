package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.os0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4668os0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2156Nr0 f32212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f32213b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f32214c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue f32215d = new PriorityQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32216e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4414mr0 f32217f;

    public C4668os0(InterfaceC2156Nr0 interfaceC2156Nr0) {
        this.f32212a = interfaceC2156Nr0;
    }

    private final void f(int i10) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.f32215d;
            if (priorityQueue.size() <= i10) {
                return;
            }
            C4414mr0 c4414mr0 = (C4414mr0) priorityQueue.poll();
            String str = AbstractC4634ob0.f32117a;
            int i11 = 0;
            while (true) {
                list = c4414mr0.f31580a;
                if (i11 >= list.size()) {
                    break;
                }
                this.f32212a.a(c4414mr0.f31581b, (P10) list.get(i11));
                this.f32213b.push((P10) list.get(i11));
                i11++;
            }
            list.clear();
            C4414mr0 c4414mr1 = this.f32217f;
            if (c4414mr1 != null && c4414mr1.f31581b == c4414mr0.f31581b) {
                this.f32217f = null;
            }
            this.f32214c.push(c4414mr0);
        }
    }

    public final void a(int i10) {
        AbstractC2418Ss0.i(i10 >= 0);
        this.f32216e = i10;
        f(i10);
    }

    public final int b() {
        return this.f32216e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 < r0.f31581b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r7, com.google.android.gms.internal.ads.P10 r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L9b
            int r0 = r6.f32216e
            if (r0 == 0) goto L9c
            r1 = -1
            if (r0 == r1) goto L2a
            java.util.PriorityQueue r0 = r6.f32215d
            int r2 = r0.size()
            int r3 = r6.f32216e
            if (r2 < r3) goto L2a
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.mr0 r0 = (com.google.android.gms.internal.ads.C4414mr0) r0
            java.lang.String r2 = com.google.android.gms.internal.ads.AbstractC4634ob0.f32117a
            long r2 = r0.f31581b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2a
            goto L9c
        L2a:
            java.util.ArrayDeque r0 = r6.f32213b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L38
            com.google.android.gms.internal.ads.P10 r0 = new com.google.android.gms.internal.ads.P10
            r0.<init>()
            goto L3e
        L38:
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.P10 r0 = (com.google.android.gms.internal.ads.P10) r0
        L3e:
            int r2 = r9.C()
            r0.z(r2)
            byte[] r2 = r9.H()
            int r9 = r9.F()
            byte[] r3 = r0.H()
            r4 = 0
            int r5 = r0.C()
            java.lang.System.arraycopy(r2, r9, r3, r4, r5)
            com.google.android.gms.internal.ads.mr0 r9 = r6.f32217f
            if (r9 == 0) goto L6a
            long r2 = r9.f31581b
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L64
            goto L6a
        L64:
            java.util.List r7 = r9.f31580a
            r7.add(r0)
            return
        L6a:
            java.util.ArrayDeque r9 = r6.f32214c
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L78
            com.google.android.gms.internal.ads.mr0 r9 = new com.google.android.gms.internal.ads.mr0
            r9.<init>()
            goto L7e
        L78:
            java.lang.Object r9 = r9.pop()
            com.google.android.gms.internal.ads.mr0 r9 = (com.google.android.gms.internal.ads.C4414mr0) r9
        L7e:
            java.util.List r2 = r9.f31580a
            boolean r3 = r2.isEmpty()
            com.google.android.gms.internal.ads.AbstractC2418Ss0.i(r3)
            r9.f31581b = r7
            r2.add(r0)
            java.util.PriorityQueue r7 = r6.f32215d
            r7.add(r9)
            r6.f32217f = r9
            int r7 = r6.f32216e
            if (r7 == r1) goto L9a
            r6.f(r7)
        L9a:
            return
        L9b:
            r7 = r0
        L9c:
            com.google.android.gms.internal.ads.Nr0 r0 = r6.f32212a
            r0.a(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4668os0.c(long, com.google.android.gms.internal.ads.P10):void");
    }

    public final void d() {
        this.f32215d.clear();
    }

    public final void e() {
        f(0);
    }
}
