package p053f2;

import Y1.d;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    @d
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @d
    long nowNanos();
}
