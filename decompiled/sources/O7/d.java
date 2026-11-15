package O7;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {
    public d() {
        super(false, 1, null);
    }

    @Override // O7.a
    public void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (b()) {
            CollectionsKt.N(drawingOperations);
        }
    }
}
