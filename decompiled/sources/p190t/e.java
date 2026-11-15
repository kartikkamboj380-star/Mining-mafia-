package p190t;

import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f49448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49451d;

    public e() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.f49448a;
        int length = iArr.length;
        int i10 = this.f49449b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        AbstractC7024j.f(iArr, iArr2, 0, i10, length);
        AbstractC7024j.f(this.f49448a, iArr2, i11, 0, this.f49449b);
        this.f49448a = iArr2;
        this.f49449b = 0;
        this.f49450c = length;
        this.f49451d = i12 - 1;
    }

    public final void a(int i10) {
        int[] iArr = this.f49448a;
        int i11 = this.f49450c;
        iArr[i11] = i10;
        int i12 = this.f49451d & (i11 + 1);
        this.f49450c = i12;
        if (i12 == this.f49449b) {
            c();
        }
    }

    public final void b() {
        this.f49450c = this.f49449b;
    }

    public final boolean d() {
        return this.f49449b == this.f49450c;
    }

    public final int e() {
        int i10 = this.f49449b;
        if (i10 == this.f49450c) {
            f fVar = f.f49452a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f49448a[i10];
        this.f49449b = (i10 + 1) & this.f49451d;
        return i11;
    }

    public e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f49451d = i10 - 1;
        this.f49448a = new int[i10];
    }

    public /* synthetic */ e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
