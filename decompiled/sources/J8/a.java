package J8;

import I8.L0;
import N8.r;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r {
    @Override // N8.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // N8.r
    public L0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // N8.r
    public int c() {
        return 1073741823;
    }
}
