package C;

import K.l;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, K.e eVar) {
        return b(contentResolver, uri, strArr, str, strArr2, str2, eVar != null ? (CancellationSignal) eVar.b() : null);
    }

    public static Cursor b(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) throws Exception {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e10) {
            if (e10 instanceof OperationCanceledException) {
                throw new l();
            }
            throw e10;
        }
    }
}
