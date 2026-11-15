package v9;

import android.os.Looper;
import u9.f;
import u9.h;
import u9.l;

/* JADX INFO: loaded from: classes3.dex */
public class d implements h {
    @Override // u9.h
    public l a(u9.c cVar) {
        return new f(cVar, Looper.getMainLooper(), 10);
    }

    @Override // u9.h
    public boolean b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
