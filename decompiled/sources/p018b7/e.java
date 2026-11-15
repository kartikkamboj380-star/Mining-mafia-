package p018b7;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p008a7.i;
import p176r5.InterfaceC7090g;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f11640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f11641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f11642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f11643d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(f fVar, a aVar, Executor executor) {
        this.f11640a = fVar;
        this.f11641b = aVar;
        this.f11642c = executor;
    }

    public static /* synthetic */ void a(e eVar, Task task, final p038d7.f fVar, g gVar) {
        eVar.getClass();
        try {
            g gVar2 = (g) task.getResult();
            if (gVar2 != null) {
                final p038d7.e eVarB = eVar.f11641b.b(gVar2);
                eVar.f11642c.execute(new Runnable() { // from class: b7.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void d(g gVar) {
        try {
            final p038d7.e eVarB = this.f11641b.b(gVar);
            for (final p038d7.f fVar : this.f11643d) {
                this.f11642c.execute(new Runnable() { // from class: b7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void e(final p038d7.f fVar) {
        this.f11643d.add(fVar);
        final Task taskE = this.f11640a.e();
        taskE.f(this.f11642c, new InterfaceC7090g() { // from class: b7.c
            @Override // p176r5.InterfaceC7090g
            public final void onSuccess(Object obj) {
                e.a(this.f11635a, taskE, fVar, (g) obj);
            }
        });
    }
}
