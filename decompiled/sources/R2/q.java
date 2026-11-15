package R2;

import android.util.SparseIntArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f5158a = new q();

    private q() {
    }

    public static final F a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(CodedOutputStream.DEFAULT_BUFFER_SIZE, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        q qVar = f5158a;
        return new F(qVar.c(), qVar.b(), sparseIntArray);
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin < 16777216 ? iMin / 2 : (iMin / 4) * 3;
    }

    private final int c() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 3145728;
        }
        return iMin < 33554432 ? 6291456 : 12582912;
    }
}
