package p055f4;

import com.facebook.soloader.E;

/* JADX INFO: loaded from: classes2.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f43648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43649b = 0;

    public e(h... hVarArr) {
        this.f43648a = hVarArr;
    }

    @Override // p055f4.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        h[] hVarArr;
        do {
            i10 = this.f43649b;
            hVarArr = this.f43648a;
            if (i10 >= hVarArr.length) {
                return false;
            }
            this.f43649b = i10 + 1;
        } while (!hVarArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
