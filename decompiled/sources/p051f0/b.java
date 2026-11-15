package p051f0;

import android.text.Editable;
import p031d0.c;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43534a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f43535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f43536c;

    private b() {
        try {
            f43536c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f43535b == null) {
            synchronized (f43534a) {
                try {
                    if (f43535b == null) {
                        f43535b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f43535b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f43536c;
        return cls != null ? c.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
