package Z8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Z8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1075d extends AbstractC1076e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1075d f7189c = new C1075d();

    private C1075d() {
    }

    public final void c(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        a(array);
    }

    public final char[] d() {
        return super.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    }
}
