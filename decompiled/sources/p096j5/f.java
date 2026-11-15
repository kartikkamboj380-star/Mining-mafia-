package p096j5;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f45551a;

    public f(Looper looper) {
        super(looper);
        this.f45551a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f45551a = Looper.getMainLooper();
    }
}
