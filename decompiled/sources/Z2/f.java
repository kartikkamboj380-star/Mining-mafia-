package Z2;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorSpace f7146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pair f7147b;

    public f(int i10, int i11, ColorSpace colorSpace) {
        this.f7146a = colorSpace;
        this.f7147b = (i10 == -1 || i11 == -1) ? null : new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final ColorSpace a() {
        return this.f7146a;
    }

    public final Pair b() {
        return this.f7147b;
    }
}
