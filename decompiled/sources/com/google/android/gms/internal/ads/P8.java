package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class P8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Comparator f22049d = new O8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f22050a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f22051b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22052c = 0;

    public P8(int i10) {
    }

    private final synchronized void c() {
        while (this.f22052c > 4096) {
            byte[] bArr = (byte[]) this.f22050a.remove(0);
            this.f22051b.remove(bArr);
            this.f22052c -= bArr.length;
        }
    }

    public final synchronized byte[] a(int i10) {
        int i11 = 0;
        while (true) {
            List list = this.f22051b;
            if (i11 >= list.size()) {
                return new byte[i10];
            }
            byte[] bArr = (byte[]) list.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f22052c -= length;
                list.remove(i11);
                this.f22050a.remove(bArr);
                return bArr;
            }
            i11++;
        }
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f22050a.add(bArr);
                List list = this.f22051b;
                int iBinarySearch = Collections.binarySearch(list, bArr, f22049d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                list.add(iBinarySearch, bArr);
                this.f22052c += length;
                c();
            }
        }
    }
}
