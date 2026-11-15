package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p176r5.InterfaceC7086c;

/* JADX INFO: loaded from: classes2.dex */
final class O implements InterfaceC7086c {
    O() {
    }

    @Override // p176r5.InterfaceC7086c
    public final /* bridge */ /* synthetic */ Object a(Task task) throws ApiException {
        if (((Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
