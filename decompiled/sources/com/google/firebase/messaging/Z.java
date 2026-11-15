package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p176r5.InterfaceC7086c;

/* JADX INFO: loaded from: classes3.dex */
class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f40206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f40207b = new p190t.a();

    interface a {
        Task start();
    }

    Z(Executor executor) {
        this.f40206a = executor;
    }

    public static /* synthetic */ Task a(Z z9, String str, Task task) {
        synchronized (z9) {
            z9.f40207b.remove(str);
        }
        return task;
    }

    synchronized Task b(final String str, a aVar) {
        Task task = (Task) this.f40207b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskJ = aVar.start().j(this.f40206a, new InterfaceC7086c() { // from class: com.google.firebase.messaging.Y
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task2) {
                return Z.a(this.f40204a, str, task2);
            }
        });
        this.f40207b.put(str, taskJ);
        return taskJ;
    }
}
