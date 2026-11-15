package P5;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f4696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f4697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f4699d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f4700e = false;

    protected o(p pVar, IntentFilter intentFilter, Context context) {
        this.f4696a = pVar;
        this.f4697b = intentFilter;
        this.f4698c = C.a(context);
    }
}
