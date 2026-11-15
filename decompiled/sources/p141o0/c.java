package p141o0;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f47132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f47133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47134d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47135e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47136f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47137g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47138h = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            c.this.o();
        }
    }

    public interface b {
        void a(c cVar, Object obj);
    }

    public c(Context context) {
        this.f47133c = context.getApplicationContext();
    }

    public void a() {
        this.f47135e = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f47138h = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void f(Object obj) {
        b bVar = this.f47132b;
        if (bVar != null) {
            bVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f47131a);
        printWriter.print(" mListener=");
        printWriter.println(this.f47132b);
        if (this.f47134d || this.f47137g || this.f47138h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f47134d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f47137g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f47138h);
        }
        if (this.f47135e || this.f47136f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f47135e);
            printWriter.print(" mReset=");
            printWriter.println(this.f47136f);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f47133c;
    }

    public boolean j() {
        return this.f47135e;
    }

    public boolean k() {
        return this.f47136f;
    }

    public boolean l() {
        return this.f47134d;
    }

    protected abstract boolean n();

    public void o() {
        if (this.f47134d) {
            h();
        } else {
            this.f47137g = true;
        }
    }

    protected abstract void r();

    public void t(int i10, b bVar) {
        if (this.f47132b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f47132b = bVar;
        this.f47131a = i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f47131a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        q();
        this.f47136f = true;
        this.f47134d = false;
        this.f47135e = false;
        this.f47137g = false;
        this.f47138h = false;
    }

    public void v() {
        if (this.f47138h) {
            o();
        }
    }

    public final void w() {
        this.f47134d = true;
        this.f47136f = false;
        this.f47135e = false;
        r();
    }

    public void x() {
        this.f47134d = false;
        s();
    }

    public boolean y() {
        boolean z9 = this.f47137g;
        this.f47137g = false;
        this.f47138h |= z9;
        return z9;
    }

    public void z(b bVar) {
        b bVar2 = this.f47132b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f47132b = null;
    }

    public void e() {
    }

    protected void m() {
    }

    protected void p() {
    }

    protected void q() {
    }

    protected void s() {
    }
}
