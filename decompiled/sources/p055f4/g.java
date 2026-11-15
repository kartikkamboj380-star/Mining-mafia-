package p055f4;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f43654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43655c;

    public g(Context context, a aVar) {
        this.f43653a = context;
        this.f43654b = aVar;
        this.f43655c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f43654b.a(strC);
    }

    private String c() {
        return this.f43653a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            Object[] objArr = eArr[i10];
            if (objArr instanceof w) {
                eArr[i10] = ((w) objArr).b(this.f43653a);
            }
        }
    }

    @Override // p055f4.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f43655c == this.f43654b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
