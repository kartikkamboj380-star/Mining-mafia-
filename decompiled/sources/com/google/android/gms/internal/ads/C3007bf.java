package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3007bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2701Ye f26890b = new C3258df();

    public C3007bf(int i10) {
        this.f26889a = i10;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        C2881af c2881af = new C2881af();
        int i11 = this.f26889a;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new C2753Ze(this));
        for (String str : strArrSplit) {
            String[] strArrB = AbstractC3132cf.b(str, false);
            if (strArrB.length != 0) {
                AbstractC3509ff.a(strArrB, i11, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c2881af.f26588b.write(this.f26890b.a(((C3383ef) it.next()).f28029b));
            } catch (IOException e10) {
                int i12 = AbstractC0786o0.f2696b;
                L4.p.d("Error while writing hash to byteStream", e10);
            }
        }
        return c2881af.toString();
    }
}
