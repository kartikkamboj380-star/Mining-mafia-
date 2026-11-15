package O7;

import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4579b;

    public c(int i10) {
        super(false, 1, null);
        this.f4579b = i10;
    }

    @Override // O7.a
    public void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (b()) {
            int i10 = this.f4579b;
            for (int iK = CollectionsKt.k(drawingOperations); i10 < iK; iK--) {
                Collections.swap(drawingOperations, i10, iK);
                i10++;
            }
        }
    }
}
