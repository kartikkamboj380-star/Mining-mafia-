package A0;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    void D();

    int D0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    void E(String str, Object[] objArr);

    void H();

    Cursor K0(String str);

    void L();

    boolean X0();

    String Y();

    boolean a1();

    Cursor f1(j jVar);

    Cursor h0(j jVar, CancellationSignal cancellationSignal);

    boolean isOpen();

    void l();

    List o();

    void p(String str);

    k t0(String str);
}
