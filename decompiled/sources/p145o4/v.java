package p145o4;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p225w4.InterfaceC7144d;

/* JADX INFO: loaded from: classes2.dex */
abstract class v implements Closeable {

    interface a {
        a a(Context context);

        v build();
    }

    v() {
    }

    abstract InterfaceC7144d a();

    abstract u c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
