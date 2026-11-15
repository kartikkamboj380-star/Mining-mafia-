package kotlin.random;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c {
    @Override // kotlin.random.c
    public int b(int i10) {
        return d.e(h().nextInt(), i10);
    }

    @Override // kotlin.random.c
    public int c() {
        return h().nextInt();
    }

    @Override // kotlin.random.c
    public int d(int i10) {
        return h().nextInt(i10);
    }

    @Override // kotlin.random.c
    public long f() {
        return h().nextLong();
    }

    public abstract Random h();
}
