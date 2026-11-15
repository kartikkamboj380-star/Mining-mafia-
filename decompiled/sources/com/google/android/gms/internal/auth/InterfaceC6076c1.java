package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6076c1 extends HasApiKey {
    Task a(C6086g c6086g);

    Task c(Account account, String str, Bundle bundle);
}
