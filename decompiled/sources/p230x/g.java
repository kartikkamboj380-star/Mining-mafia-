package p230x;

/* JADX INFO: loaded from: classes.dex */
class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f50466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50467b;

    g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f50466a = new Object[i10];
    }

    @Override // p230x.f
    public boolean a(Object obj) {
        int i10 = this.f50467b;
        Object[] objArr = this.f50466a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f50467b = i10 + 1;
        return true;
    }

    @Override // p230x.f
    public Object b() {
        int i10 = this.f50467b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f50466a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f50467b = i10 - 1;
        return obj;
    }

    @Override // p230x.f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f50467b;
            Object[] objArr2 = this.f50466a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f50467b = i12 + 1;
            }
        }
    }
}
