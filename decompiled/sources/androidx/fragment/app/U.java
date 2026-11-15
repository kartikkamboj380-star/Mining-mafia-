package androidx.fragment.app;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class U extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f9971b = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

    U(String str) {
        this.f9970a = str;
    }

    private void a() {
        if (this.f9971b.length() > 0) {
            Log.d(this.f9970a, this.f9971b.toString());
            StringBuilder sb = this.f9971b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f9971b.append(c10);
            }
        }
    }
}
