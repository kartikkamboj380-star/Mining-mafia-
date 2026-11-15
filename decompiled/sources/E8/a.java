package E8;

import java.util.NoSuchElementException;
import kotlin.collections.C;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f647d;

    public a(int i10, int i11, int i12) {
        this.f644a = i12;
        this.f645b = i11;
        boolean z9 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z9 = true;
        }
        this.f646c = z9;
        this.f647d = z9 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f646c;
    }

    @Override // kotlin.collections.C
    public int nextInt() {
        int i10 = this.f647d;
        if (i10 != this.f645b) {
            this.f647d = this.f644a + i10;
            return i10;
        }
        if (!this.f646c) {
            throw new NoSuchElementException();
        }
        this.f646c = false;
        return i10;
    }
}
