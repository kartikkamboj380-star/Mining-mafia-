package p141o0;

import C.a;
import K.e;
import K.l;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c.a f47123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f47124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String[] f47125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f47126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String[] f47127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f47128t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Cursor f47129u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f47130v;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f47123o = new c.a();
        this.f47124p = uri;
        this.f47125q = strArr;
        this.f47126r = str;
        this.f47127s = strArr2;
        this.f47128t = str2;
    }

    @Override // p141o0.a
    public void A() {
        super.A();
        synchronized (this) {
            try {
                e eVar = this.f47130v;
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p141o0.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f47129u;
        this.f47129u = cursor;
        if (l()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p141o0.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Cursor G() {
        synchronized (this) {
            if (F()) {
                throw new l();
            }
            this.f47130v = new e();
        }
        try {
            Cursor cursorA = a.a(i().getContentResolver(), this.f47124p, this.f47125q, this.f47126r, this.f47127s, this.f47128t, this.f47130v);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.f47123o);
                } catch (RuntimeException e10) {
                    cursorA.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f47130v = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.f47130v = null;
                throw th;
            }
        }
    }

    @Override // p141o0.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void H(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // p141o0.a, p141o0.c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f47124p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f47125q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f47126r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f47127s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f47128t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f47129u);
    }

    @Override // p141o0.c
    protected void q() {
        super.q();
        s();
        Cursor cursor = this.f47129u;
        if (cursor != null && !cursor.isClosed()) {
            this.f47129u.close();
        }
        this.f47129u = null;
    }

    @Override // p141o0.c
    protected void r() {
        Cursor cursor = this.f47129u;
        if (cursor != null) {
            f(cursor);
        }
        if (y() || this.f47129u == null) {
            h();
        }
    }

    @Override // p141o0.c
    protected void s() {
        b();
    }
}
