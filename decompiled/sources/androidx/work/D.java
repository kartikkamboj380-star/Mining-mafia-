package androidx.work;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11179a = q.i("WorkerFactory");

    class a extends D {
        a() {
        }

        @Override // androidx.work.D
        public p a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static D c() {
        return new a();
    }

    public abstract p a(Context context, String str, WorkerParameters workerParameters);

    public final p b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        p pVarA = a(context, str, workerParameters);
        if (pVarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(p.class);
            } catch (Throwable th) {
                q.e().d(f11179a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    pVarA = (p) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    q.e().d(f11179a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (pVarA == null || !pVarA.isUsed()) {
            return pVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
