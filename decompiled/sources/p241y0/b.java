package p241y0;

import A0.g;
import A0.j;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p229w8.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        List listC = CollectionsKt.c();
        Cursor cursorK0 = db.K0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorK0.moveToNext()) {
            try {
                listC.add(cursorK0.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(cursorK0, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.f45918a;
        c.a(cursorK0, null);
        for (String triggerName : CollectionsKt.a(listC)) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (StringsKt.J(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db.p("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(u db, j sqLiteQuery, boolean z9, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db.query(sqLiteQuery, cancellationSignal);
        if (!z9 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorQuery) : cursorQuery;
    }

    public static final int c(File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            c.a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(channel, th);
                throw th2;
            }
        }
    }
}
