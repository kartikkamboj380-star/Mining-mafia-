package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
class o0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40315a;

    interface a {
        Task a(Intent intent);
    }

    o0(a aVar) {
        this.f40315a = aVar;
    }

    void b(final r0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f40315a.a(aVar.f40327a).c(new p191t0.j(), new OnCompleteListener() { // from class: com.google.firebase.messaging.n0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.d();
            }
        });
    }
}
