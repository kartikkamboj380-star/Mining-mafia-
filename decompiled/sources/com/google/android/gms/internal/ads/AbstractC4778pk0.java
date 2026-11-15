package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p176r5.C7085b;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4778pk0 {
    public static com.google.common.util.concurrent.p a(Task task, C7085b c7085b) {
        final C4526nk0 c4526nk0 = new C4526nk0(task, null);
        task.c(AbstractC2272Px0.a(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.ok0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                C4526nk0 c4526nk1 = c4526nk0;
                if (task2.m()) {
                    c4526nk1.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    c4526nk1.k(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                c4526nk1.l(exception);
            }
        });
        return c4526nk0;
    }
}
